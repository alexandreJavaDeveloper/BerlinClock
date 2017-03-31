package com.hotels.clock;

import com.hotels.exception.InvalidTimeException;
import com.hotels.rules.BerlinClockRules;

/**
 * Class that converts the time to Berlin time.
 */
public class BerlinClock
{
    /**
     * TODO
     *
     * @param hours
     * @param minutes
     * @param seconds
     * @return multi line string
     * @throws InvalidTimeException
     */
    public String convertToBerlinTime(final int hours, final int minutes, final int seconds) throws InvalidTimeException
    {
        final int numberLamps_by_TopmostLine = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        final int numberLamps_by_SecondLine = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        final int numberLamps_by_ThirdLine = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        final int numberLamps_by_LastLine = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);

        // verify how I will create the part of view.
        // put the result as console output as well

        return "";
    }
}