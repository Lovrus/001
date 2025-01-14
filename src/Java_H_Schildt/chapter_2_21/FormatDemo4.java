package Java_H_Schildt.chapter_2_21;
// Демонстрация использования спецификатора минимальной ширины поля.

import java.util.*;

public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("|%f|%n|%12f|%n|%012|",
                10.12345, 10.12345, 10.12345);
        System.out.println(fmt);
        fmt.close();
    }
}

