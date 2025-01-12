package chapter_2_31;
// Разбор строки с датой и временем.
// Продолжение.

import java.time.*;
import java.time.format.*;

public class DateTimeDemo4 {
    public static void main(String[] args) {
// Получить объект LocalDateTime путем разбора строки с датой и временем.
        LocalDateTime curDateTime =
                LocalDateTime.parse("June 30, 2021 12:01 AM",
                        DateTimeFormatter.ofPattern("MMMM d',' yyyy hh':'mm a"));
        // Отобразить результаты разбора.
        System.out.println(curDateTime.format(
                DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")));
    }
}
