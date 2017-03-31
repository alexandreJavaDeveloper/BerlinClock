package com.hotels.rules;

import com.hotels.exception.InvalidTimeException;

/**
 * Rules to the specific logic to how returns the number of colors of Berlin Clock from
 * each part of line (topmost, second, third and last line).
 */
public class BerlinClockRules
{
    private BerlinClockRules()
    {
        // do nothing
    }

    /**
     * Return the number of lamps of the topmost line of Berlin Clock.
     *
     * @param hours
     * @return number of lamps
     * @throws InvalidTimeException invalid hour
     */
    public static int fetchNumberLamps_by_TopmostLine(final int hours) throws InvalidTimeException
    {
        if (hours < 0 || hours > 24)
            throw new InvalidTimeException();

        return hours / 5;
    }

    /**
     * Return the number of lamps of the second line of Berlin Clock.
     *
     * @param hours
     * @return number of lamps
     * @throws InvalidTimeException
     */
    public static int fetchNumberLamps_by_SecondLine(final int hours) throws InvalidTimeException
    {
        if (hours < 0 || hours > 24)
            throw new InvalidTimeException();

        return hours % 5;
    }

    /**
     * Return the number of lamps of the third line of Berlin Clock.
     *
     * @param minutes
     * @return number of lamps
     * @throws InvalidTimeException
     */
    public static int fetchNumberLamps_by_ThirdLine(final int minutes) throws InvalidTimeException
    {
        if (minutes < 0 || minutes > 59)
            throw new InvalidTimeException();

        return minutes / 5;
    }

    /**
     * Return the number of lamps of the last line of Berlin Clock.
     *
     * @param minutes
     * @return number of lamps
     * @throws InvalidTimeException
     */
    public static int fetchNumberLamps_by_LastLine(final int minutes) throws InvalidTimeException
    {
        if (minutes < 0 || minutes > 59)
            throw new InvalidTimeException();

        return minutes % 5;
    }
}