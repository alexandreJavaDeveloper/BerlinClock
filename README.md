# BerlinClock

## History
- Mengenlehreuhr (German for "Set Theory Clock") or Berlin-Uhr ("Berlin Clock") is the first public clock in the world that tells the time by means of illuminated, coloured fields, for which it entered the Guinness Book of Records upon its installation on 17 June 1975. Wikipedia source.

## Description
- Created a representation of the Berlin Clock for a given time (hh::mm:ss).
- The time is calculated by adding the lit rectangular lamps.
- The top lamp is a pump which is blinking on/off every two seconds.
- In the topmost line of red lamps every lamp represents 5 hours.
- In the second line of red lamps every lamp represents 1 hour.
- So if in the first line 2 lamps are lit and in the second line 3 lamps its 5+5+3=13h or 1 p.m.
- In the third line with tall lamps every lamp represents 5 minutes.
- There are 11 lamps, the 3rd, 6th, and 9th are red indicating the first quarter, half, and the last quarter of the hour.
- In the last line with yellow lamps every lamp represents 1 minute.

## Applications that must be installed before running this project
- Java JRE 8
- Maven 3

## How to execute (running tests)
- git clone https://github.com/alexandreJavaDeveloper/BerlinClock.git
- cd BerlinClock/
- mvn clean package
- At this stage, will be logged out in the console the Berlin Clock result. This uses all structure of the code of this project.

## Test Coverage
- 100%

## TODO
- Nothing in this moment.