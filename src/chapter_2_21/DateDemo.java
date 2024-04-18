package chapter_2_21;
// Отображение даты и времени с использованием только методов класса Date.

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // Создать объект Date.
        Date date = new Date();
        // Отобразить время и дату с применением toString().
        System.out.println(date);
        // Отобразить количество миллисекунд, прошедших с 1 января 1970 года,
        // как стреднее время по Гринвичу.
        long msec = date.getTime();
        System.out.println("Количество миллисекунд, прошедших с 1 января 1970 года," +
                "ПЬЕ = " + msec);
    }
}
