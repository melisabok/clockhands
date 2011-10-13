package com.globant.apptest;

import org.junit.Assert;
import org.junit.Test;

public class ClockHandsConverterTest {

	@Test
	public void testTwoOClockShouldRetrieve60degrees()
	{
		int degrees = ClockHandsConverter.toDegrees(2, 0);
		
		Assert.assertEquals(60, degrees);
		
	}
	
	@Test
	public void testTenOClockShouldRetrieve60degrees()
	{
		int degrees = ClockHandsConverter.toDegrees(10, 0);
		
		Assert.assertEquals(60, degrees);
		
	}
	
	@Test
	public void testTwelveOClockShouldRetrieve0degrees()
	{
		int degrees = ClockHandsConverter.toDegrees(12, 0);
		
		Assert.assertEquals(0, degrees);
		
	}
	
	@Test
	public void test0AndHalfOClockShouldRetrieve180degrees()
	{
		int degrees = ClockHandsConverter.toDegrees(0, 30);
		
		Assert.assertEquals(180, degrees);
		
	}
	
	@Test
	public void test4And40OClockShouldRetrieve120degrees()
	{
		int degrees = ClockHandsConverter.toDegrees(4, 40);
		
		Assert.assertEquals(120, degrees);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidHourHand()
	{
		ClockHandsConverter.toDegrees(13, 30);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testInvalidMinuteHand()
	{
		ClockHandsConverter.toDegrees(12, -1);
	}
}
