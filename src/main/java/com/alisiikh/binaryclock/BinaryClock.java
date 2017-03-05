package com.alisiikh.binaryclock;

/**
 * @author lial
 */
public class BinaryClock {
	private int mainHoursBinary;
	private int secondaryHoursBinary;
	private int mainMinutesBinary;
	private int secondaryMinutesBinary;
	private int mainSecondsBinary;
	private int secondarySecondsBinary;

	public void setMainHoursBinary(int mainHoursBinary) {
		this.mainHoursBinary = mainHoursBinary;
	}

	public void setSecondaryHoursBinary(int secondaryHoursBinary) {
		this.secondaryHoursBinary = secondaryHoursBinary;
	}

	public void setMainMinutesBinary(int mainMinutesBinary) {
		this.mainMinutesBinary = mainMinutesBinary;
	}

	public void setSecondaryMinutesBinary(int secondaryMinutesBinary) {
		this.secondaryMinutesBinary = secondaryMinutesBinary;
	}

	public void setMainSecondsBinary(int mainSecondsBinary) {
		this.mainSecondsBinary = mainSecondsBinary;
	}

	public void setSecondarySecondsBinary(int secondarySecondsBinary) {
		this.secondarySecondsBinary = secondarySecondsBinary;
	}

	public String getMainHoursBinary() {
		return String.format("%2s", Integer.toBinaryString(mainHoursBinary)).replace(' ', '0');
	}

	public String getSecondaryHoursBinary() {
		return String.format("%4s", Integer.toBinaryString(secondaryHoursBinary)).replace(' ', '0');
	}

	public String getMainMinutesBinary() {
		return String.format("%3s",Integer.toBinaryString(mainMinutesBinary)).replace(' ', '0');
	}

	public String getSecondaryMinutesBinary() {
		return String.format("%4s", Integer.toBinaryString(secondaryMinutesBinary)).replace(' ', '0');
	}

	public String getMainSecondsBinary() {
		return String.format("%3s", Integer.toBinaryString(mainSecondsBinary)).replace(' ', '0');
	}

	public String getSecondarySecondsBinary() {
		return String.format("%4s", Integer.toBinaryString(secondarySecondsBinary)).replace(' ', '0');
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		BinaryClock that = (BinaryClock) o;

		if (mainHoursBinary != that.mainHoursBinary)
			return false;
		if (secondaryHoursBinary != that.secondaryHoursBinary)
			return false;
		if (mainMinutesBinary != that.mainMinutesBinary)
			return false;
		if (secondaryMinutesBinary != that.secondaryMinutesBinary)
			return false;
		if (mainSecondsBinary != that.mainSecondsBinary)
			return false;
		return secondarySecondsBinary == that.secondarySecondsBinary;
	}

	@Override
	public int hashCode() {
		int result = mainHoursBinary;
		result = 31 * result + secondaryHoursBinary;
		result = 31 * result + mainMinutesBinary;
		result = 31 * result + secondaryMinutesBinary;
		result = 31 * result + mainSecondsBinary;
		result = 31 * result + secondarySecondsBinary;
		return result;
	}
}
