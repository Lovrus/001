package Java_H_Schildt.chapter_2_21;
// Создание таблицы квадратов и кубов.

import java.util.*;

public class FieldWidthdemo {
    public static void main(String[] args) {
        Formatter fmt;
        for (int i = 0; i <= 10; i++) {
            fmt = new Formatter();
            fmt.format("%4d %4d %4d", i, i * i, i * i * i);
            System.out.println(fmt);
            fmt.close();
        }
    }
}
