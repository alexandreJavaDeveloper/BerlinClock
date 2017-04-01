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
	public String fetchBerlinTime(final int hours, final int minutes, final int seconds) throws InvalidTimeException
	{
		final int topmostLine = BerlinClockRules.fetchNumberLamps_by_TopmostLine(hours);
		final int secondLine = BerlinClockRules.fetchNumberLamps_by_SecondLine(hours);
		final int thirdLine = BerlinClockRules.fetchNumberLamps_by_ThirdLine(minutes);
		final int lastLine = BerlinClockRules.fetchNumberLamps_by_LastLine(minutes);

		// an advanced output to have a log
		this.printAsConsoleOutput(topmostLine, secondLine, thirdLine, lastLine, seconds);

		// create the return of multi line String
		return this.asMultiLine(topmostLine, secondLine, thirdLine, lastLine);
	}

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

	private void printAsConsoleOutput(final int topmostLine, final int secondLine, final int thirdLine, final int lastLine,
			final int seconds)
	{
		int finishTimeInSeconds = seconds;

		while(finishTimeInSeconds > 0){
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

			//			Thread.sleep(millis);
			finishTimeInSeconds--;
		}
	}
}