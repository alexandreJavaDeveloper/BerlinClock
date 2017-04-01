package com.hotels.clock;

import com.hotels.exception.InvalidTimeException;
import com.hotels.rules.BerlinClockRules;

/**
 * Class to handler times from normal time (HOUR, MINUTE, SECOND) to Berlin time.
 */
public class BerlinClock
{
    // The top lamp is a pump which is blinking on/off every two seconds
    private final long BLINK_CLOCK = 2000;

    /**
     * Receives the time as HOUR, MINUTES, SECONDS and converts to Berlin Time.
     *
     * The method executes the print as console output and returns as String multi line.
     * Example:
     *      1º line: topmostLine
     *      2ª line: secondLine
     *      3ª line: thirdLine
     *      4ª line: lastLine
     *
     * @param hours
     * @param minutes
     * @param seconds
     * @return multi line string
     * @throws InvalidTimeException
     */
    public String fetchBerlinTime(final int hours, final int minutes, final int seconds) throws InvalidTimeException
    {
        final int topmostLine = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
        final int secondLine = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
        final int thirdLine = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
        final int lastLine = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);

        // an advanced output of the Berlin time
        this.printAsConsoleOutput(topmostLine, secondLine, thirdLine, lastLine, seconds);

        // create String multi line
        return this.asMultiLine(topmostLine, secondLine, thirdLine, lastLine);
    }

    /**
     * Prepare and returns the Berlin Clock as String separated by each line:
     *      1º line: topmostLine
     *      2ª line: secondLine
     *      3ª line: thirdLine
     *      4ª line: lastLine
     *
     * @param topmostLine
     * @param secondLine
     * @param thirdLine
     * @param lastLine
     * @return Berlin Clock as multi line
     */
    private String asMultiLine(final int topmostLine, final int secondLine, final int thirdLine, final int lastLine)
    {
        final StringBuilder builder = new StringBuilder();

        builder.append(topmostLine);
        builder.append("\n");
        builder.append(secondLine);
        builder.append("\n");
        builder.append(thirdLine);
        builder.append("\n");
        builder.append(lastLine);

        return builder.toString();
    }

    /**
     * Print the Berlin Clock as console output, blinking the clock each time defined by the parameter {@value seconds}.
     *
     * @param topmostLine
     * @param secondLine
     * @param thirdLine
     * @param lastLine
     * @param seconds
     */
    private void printAsConsoleOutput(final int topmostLine, final int secondLine, final int thirdLine, final int lastLine, final int seconds)
    {
        int finishTimeInSeconds = seconds;

        do
        {
            System.out.println("\n# Berlin Clock:");

            final String alignFormat = "| %-12s | %-11s | %-10s | %-9s |%n";

            System.out.format("+--------------+-------------+------------+-----------+%n");
            System.out.format("| Topmost Line | Second Line | Third Line | Last Line |%n");
            System.out.format("+--------------+-------------+------------+-----------+%n");

            System.out.format(alignFormat,//
                "Lamps: " + topmostLine,//
                "Lamps: " + secondLine,//
                "Lamps: " + thirdLine,//
                "Lamps: " + lastLine);

            System.out.format("+--------------+-------------+------------+-----------+%n");

            try
            {
                Thread.sleep(this.BLINK_CLOCK);
            }
            catch (final InterruptedException e)
            {
                // if the current Thread is interrupted, just stop the process. Is not necessary any treatment
                e.printStackTrace();
                return;
            }

        } while (--finishTimeInSeconds > 0);
    }
}