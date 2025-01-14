package Java_H_Schildt.chapter_2_21;
// Демонстрация использования спецификаторов формата %f и %e.

import java.util.*;

public class FormatDemo2 {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        for (double i = 1.23; i < 1.0e+6; i *= 100) {
            fmt.format("%f %e", i, i);
            System.out.println(fmt);
        }
        fmt.close();
    }
}
