package problems.problem_two;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

public class ProblemTwo {

    public static void main(String[] args) {
        List<LocalDate> mondays = new ArrayList<>();

        LocalDate firstDatOfNextYear = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        LocalDate firstMonday = firstDatOfNextYear.getDayOfWeek() == DayOfWeek.MONDAY
                ? firstDatOfNextYear : firstDatOfNextYear.with(TemporalAdjusters.next(DayOfWeek.MONDAY));

        LocalDate currentMonday = firstMonday;
        while (currentMonday.getYear() == firstMonday.getYear()) {
         mondays.add(currentMonday);
         currentMonday = currentMonday.plusWeeks(1);
        }

        System.out.println(mondays);
    }
}