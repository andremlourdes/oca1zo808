package tq30;

/*
🎯 ObjectiveWe want to calculate:The difference in years, months, and days
→ PeriodThe difference in hours, minutes, and seconds → DurationAnd all of this based on two LocalDateTime.
🚦 Why calculate this way?
 Period.between() ignores hours and minutes — so we only use the date part.
 Then we apply the period to the initial date to calculate the remaining difference (hours, minutes, etc.) with Duration.
  If you want to make this even more dynamic (like calculating "time remaining until now" or "time since an event"),
  I can help you make this code flexible and real-time! Would you like to do that?
 */


import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;

public class timeUntilTheEvent {
    public static void main(String[] args) {
        // Date of the future event
        LocalDateTime event = LocalDateTime.of(2025, 12, 25, 0, 0);

        // Current data (now)
        LocalDateTime now = LocalDateTime.now();

        // First, calculate the period (years, months, days)
        Period period = Period.between(now.toLocalDate(), event.toLocalDate());

        // Apply the period to the current date to get the remaining accurately.
        LocalDateTime adjusted = now.plusYears(period.getYears())
                .plusMonths(period.getMonths())
                .plusDays(period.getDays());

        // Now calculate the duration (hours, minutes, seconds)
        Duration duration = Duration.between(adjusted, event);

        // Show all
        System.out.println("Until the event remains:");
        System.out.println(period.getYears() + " years, " +
                period.getMonths() + " months, " +
                period.getDays() + " days");
        System.out.println(duration.toHoursPart() + " hours, " +
                duration.toMinutesPart() + " minutes, " +
                duration.toSecondsPart() + " seconds");
    }
}
