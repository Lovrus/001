package Java_H_Schildt.chapter_2_21;
// Демонстрация выравнивания по левому краю.

import java.util.*;

public class LeftJustify {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        // По умолчанию выполняется выравнивание по правому краю.
        fmt.format("|%10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
        // Теперь выровнять по левому краю.
        fmt = new Formatter();
        fmt.format("|%-10.2f|", 123.123);
        System.out.println(fmt);
        fmt.close();
    }
}
