package chapter_2_21;
// Использование относительных индексов для упрощения
// создания специального форматавремени и даты.

import java.util.*;

public class FormatDemo6 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();
        fmt.format("Сегодняшний день %te месяца %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
