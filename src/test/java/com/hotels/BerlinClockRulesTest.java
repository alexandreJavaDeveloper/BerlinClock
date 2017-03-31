package com.hotels;

import org.junit.Assert;
import org.junit.Test;

import com.hotels.exception.InvalidTimeException;
import com.hotels.rules.BerlinClockRules;

public class BerlinClockRulesTest
{
    @Test
    public void testFetchNumberLamps_by_TopmostLine() throws InvalidTimeException
    {
        int hours = 0;
        int numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 4;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 5;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(1, numberLamps);

        hours = 9;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(1, numberLamps);

        hours = 10;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(2, numberLamps);

        hours = 14;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(2, numberLamps);

        hours = 15;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(3, numberLamps);

        hours = 19;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(3, numberLamps);

        hours = 20;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(4, numberLamps);

        hours = 21;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(4, numberLamps);

        hours = 24;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        Assert.assertEquals(4, numberLamps);

    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeByTopmostLine() throws InvalidTimeException
    {
        final int hours = 25;
        BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeByTopmostLine2() throws InvalidTimeException
    {
        final int hours = -1;
        BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
    }

    @Test
    public void testFetchNumberLamps_by_SecondLine() throws InvalidTimeException
    {
        int hours = 0;
        int numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 1;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(1, numberLamps);

        hours = 5;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 7;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(2, numberLamps);

        hours = 10;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 13;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(3, numberLamps);

        hours = 15;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 19;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(4, numberLamps);

        hours = 20;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(0, numberLamps);

        hours = 24;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        Assert.assertEquals(4, numberLamps);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeBySecondLine() throws InvalidTimeException
    {
        final int hours = 25;
        BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeSecondLine2() throws InvalidTimeException
    {
        final int hours = -1;
        BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
    }

    @Test
    public void testFetchNumberLamps_by_ThirdLine() throws InvalidTimeException
    {
        int minutes = 0;
        int numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(0, numberLamps);

        minutes = 4;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(0, numberLamps);

        minutes = 5;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(1, numberLamps);

        minutes = 9;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(1, numberLamps);

        minutes = 10;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(2, numberLamps);

        minutes = 19;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(3, numberLamps);

        minutes = 29;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(5, numberLamps);

        minutes = 40;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(8, numberLamps);

        minutes = 46;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(9, numberLamps);

        minutes = 55;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(11, numberLamps);

        minutes = 59;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        Assert.assertEquals(11, numberLamps);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeByThirdLine() throws InvalidTimeException
    {
        final int minutes = 60;
        BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeThirdLine2() throws InvalidTimeException
    {
        final int minutes = -1;
        BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
    }

    @Test
    public void testFetchNumberLamps_by_LastLine() throws InvalidTimeException
    {
        int minutes = 0;
        int numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(0, numberLamps);

        minutes = 4;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(4, numberLamps);

        minutes = 5;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(0, numberLamps);

        minutes = 9;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(4, numberLamps);

        minutes = 10;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(0, numberLamps);

        minutes = 22;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(2, numberLamps);

        minutes = 33;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(3, numberLamps);

        minutes = 56;
        numberLamps = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
        Assert.assertEquals(1, numberLamps);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeByLastLine() throws InvalidTimeException
    {
        final int minutes = 60;
        BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
    }

    @Test(expected = InvalidTimeException.class)
    public void testInvalidTimeLastLine2() throws InvalidTimeException
    {
        final int minutes = -1;
        BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);
    }
}