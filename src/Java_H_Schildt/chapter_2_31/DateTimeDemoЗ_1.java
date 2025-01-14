package Java_H_Schildt.chapter_2_31;
// Создание специального формата для вывода даты и времени.

import java.time.*;
import java.time.format.*;

public class DateTimeDemoЗ_1 {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime.format(
                DateTimeFormatter.ofPattern("MMMM d ',' yyy h ':'mm a")));
    }
}
