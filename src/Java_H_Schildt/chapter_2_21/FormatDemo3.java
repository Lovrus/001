package Java_H_Schildt.chapter_2_21;
// Демонстрация использования спецификаторов формата $n и %%.

import java.util.*;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter ftm = new Formatter();
        ftm.format("Копирование файла%nПередача завершена на %d%%", 88);
        System.out.println(ftm);
        ftm.close();
    }
}
