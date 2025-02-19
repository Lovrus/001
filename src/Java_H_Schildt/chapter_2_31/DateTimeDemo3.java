package Java_H_Schildt.chapter_2_31;
// Демонстрация использования DateTimeFormatter.

import java.time.*;
import java.time.format.*;

public class DateTimeDemo3 {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(
                DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        LocalTime curTime = LocalTime.now();
        System.out.println(curTime.format(
                DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
    }
}
