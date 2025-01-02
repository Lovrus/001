package chapter_2_31;

import java.time.*;

// Простой пример использования LocalDate и LocalTime.
public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate);
        LocalTime curTime = LocalTime.now();
        System.out.println(curTime);
    }
}
