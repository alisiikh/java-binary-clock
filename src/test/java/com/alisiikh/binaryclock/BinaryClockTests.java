package com.alisiikh.binaryclock;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author lial
 */
public class BinaryClockTests {

	private IBinaryClockConverter clockConverter = new BinaryClockConverter();

	@Test
	public void testBinaryClockShowsCorrectTime() {
		// given:
		String time = "10:37:49";

		// when:
		BinaryClock clock = clockConverter.convert(time);

		// then:
		assertEquals("01", clock.getMainHoursBinary());
		assertEquals("0000", clock.getSecondaryHoursBinary());
		assertEquals("011", clock.getMainMinutesBinary());
		assertEquals("0111", clock.getSecondaryMinutesBinary());
		assertEquals("100", clock.getMainSecondsBinary());
		assertEquals("1001", clock.getSecondarySecondsBinary());
	}
}
