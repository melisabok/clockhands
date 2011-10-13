package com.globant.apptest;

/**
 * Converter class to do operations over the clock hands
 * @author Melisa
 *
 */
public class ClockHandsConverter {

	/**
	 * Calculate the angle given the hour and minute hands of a clock
	 * @param hourHand: should be between 0 and 12, represent the hour
	 * @param minuteHand: should be between 0 and 60, represent the minute
	 * @return
	 */
	public static int toDegrees(int hourHand, int minuteHand){
		if (hourHand < 0 || hourHand > 12) {
			throw new IllegalArgumentException("illegal hour hand: " + hourHand);
		}
		if (minuteHand < 0 || minuteHand > 60) {
			throw new IllegalArgumentException("illegal minute hand: " + minuteHand);
		}
		
		int hourPart = hourHand * 5;
		int minutePart = minuteHand;
		int difference = Math.abs(hourPart - minutePart);
		int degrees = difference * 6;

		// minimum angle
		if (degrees > 180) {
			degrees = 360 - degrees;
		}
		return degrees;

	}

}
