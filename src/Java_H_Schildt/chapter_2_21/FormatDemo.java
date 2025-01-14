package Java_H_Schildt.chapter_2_21;
// Очень простой пример использования Formatter.

import java.util.*;

public class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        fmt.format("Форматировать  %s легко: %d %f", "с помощью Java", 10, 98.6);
        System.out.println(fmt);
        fmt.close();
    }
}
