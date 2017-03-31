package com.hotels;

import org.junit.Test;

import com.hotels.clock.BerlinClock;
import com.hotels.exception.InvalidTimeException;

public class BerlinClockTest
{
    @Test
    public void test() throws InvalidTimeException
    {
        BerlinClock berlinClock = new BerlinClock();
        
        int hours = 10;
        int minutes = 56;
        int seconds = 0;
        String berlinTime = berlinClock.convertToBerlinTime(hours, minutes, seconds);
        System.out.println(berlinTime);
    }
}