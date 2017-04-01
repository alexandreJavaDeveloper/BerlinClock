package com.hotels;

import org.junit.Assert;
import org.junit.Test;

import com.hotels.clock.BerlinClock;
import com.hotels.exception.InvalidTimeException;

public class BerlinClockTest
{
    private final BerlinClock berlinClock = new BerlinClock();

    @Test
    public void testFecthBerlinTime() throws InvalidTimeException
    {
        final int hours = 10;
        final int minutes = 56;
        final int seconds = 2;
        final String berlinTime = this.berlinClock.fetchBerlinTime(hours, minutes, seconds);
        Assert.assertEquals("2\n0\n11\n1", berlinTime);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTime() throws InvalidTimeException
    {
        this.berlinClock.fetchBerlinTime(70, 10, 2);
    }
}