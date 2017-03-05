package com.alisiikh.binaryclock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lial
 */
public class BinaryClockConverter implements IBinaryClockConverter {

	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

	public BinaryClock convert(String time) {
		LocalTime localTime = LocalTime.parse(time, formatter);

		int hours = localTime.getHour();
		int minutes = localTime.getMinute();
		int seconds = localTime.getSecond();

		BinaryClock binaryClock = new BinaryClock();

		int baseHours = hours / 10;
		int extraHours = hours % 10;
		int baseMinutes = minutes / 10;
		int extraMinutes = minutes % 10;
		int baseSeconds = seconds / 10;
		int extraSeconds = seconds % 10;

		binaryClock.setMainHoursBinary(baseHours);
		binaryClock.setSecondaryHoursBinary(extraHours);

		binaryClock.setMainMinutesBinary(baseMinutes);
		binaryClock.setSecondaryMinutesBinary(extraMinutes);

		binaryClock.setMainSecondsBinary(baseSeconds);
		binaryClock.setSecondarySecondsBinary(extraSeconds);

		return binaryClock;
	}
}
