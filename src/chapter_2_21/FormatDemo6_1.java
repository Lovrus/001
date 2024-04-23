package chapter_2_21;
// Использование автоматического управления ресурсами с классом Formatter

import java.util.*;

public class FormatDemo6_1 {
    public static void main(String[] args) {
        try (Formatter ftm = new Formatter()) {
            ftm.format("Форматировать %s легко: %d %f", "с помощью Java", 10, 98.6);
            System.out.println(ftm);
        }
    }
}
