package Java_H_Schildt.chapter_2_21;
// Демонстрация использования флага пробела.

import java.util.*;

public class FormatDemo5 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("% d", -100);
        System.out.println(fmt);
        fmt.close();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt.close();
        fmt.format("% d", -200);
        System.out.println(fmt);
        fmt.close();
        fmt.format("% d", 200);
        System.out.println(fmt);
        fmt.close();
    }
}
