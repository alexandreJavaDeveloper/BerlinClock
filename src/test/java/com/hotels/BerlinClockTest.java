package com.hotels;

import org.junit.Assert;
import org.junit.Test;

import com.hotels.clock.BerlinClock;
import com.hotels.exception.InvalidTimeException;

public class BerlinClockTest
{
	@Test
	public void testFecthBerlinTime() throws InvalidTimeException
	{
		final BerlinClock berlinClock = new BerlinClock();

		final int hours = 10;
		final int minutes = 56;
		final int seconds = 0;
		final String berlinTime = berlinClock.fetchBerlinTime(hours, minutes, seconds);
		Assert.assertEquals("2\n0\n11\n1", berlinTime);
	}
}