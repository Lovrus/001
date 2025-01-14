package Java_H_Schildt.chapter_2_21;
// Демонстрация использования спецификатора точности.

import java.util.*;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        // Форматировать с 4 десятичными разрядами.
        fmt.format("%.4f", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        // Форматировать 2 десятичными разрядами в 16-символьном поле.
        fmt = new Formatter();
        fmt.format("%16.2e", 123.1234567);
        System.out.println(fmt);
        fmt.close();
        // Отобразить не более 15 символов в строке.
        fmt = new Formatter();
        fmt.format("%.15s", "Форматировать с помощью Java теперь легко.");
        System.out.println(fmt);
        fmt.close();
    }
}
