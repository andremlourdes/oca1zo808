package tq29;

/*
This refers to the Period class from the Java Date and Time API (java.time).
The Period class represents a quantity of time in terms of years, months,
 and days — unlike Duration, which works with hours, minutes, and seconds.
 */
import java.time.Period;

public class Test {
    public static void main(String [] args) {
        /*
        Period.of(0, 0, 0) creates a Period object with: 0 years 0 months 0 days
         */
        Period period = Period.of(0, 0, 0);
        /*
         When you print this object using System.out.println(period);
          Java converts the Period to its default text format:P0D

          📖 What does P0D mean?
          P stands for "Period" (from the ISO 8601 standard). 0D indicates that the period has zero days.
           Since the values for years and months are also zero, the format simplifies to only the days.
            For example, if you created a Period.of(1, 2, 3), it would print: P1Y2M3D — 1 year, 2 months, and 3 days.
         */
        System.out.println(period);
    }
}
