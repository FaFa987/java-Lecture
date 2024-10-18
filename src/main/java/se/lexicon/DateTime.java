package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getClass());
        String year = "2022-01-11";
        //String month = "January";
        LocalDate yearDate = LocalDate.parse(year);
        System.out.println(yearDate);
        System.out.println(yearDate.getYear());
        System.out.println(yearDate.plusDays(25));

    }
}
