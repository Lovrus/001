package Java_H_Schildt.chapter_2_21;
// Использование класса Scanner для расчета среднего по списку значений,
// разделенных запятыми.

import java.util.*;
import java.io.*;

public class SetDelimiters {
    public static void main(String[] args) throws IOException {
        int count = 0;
        double sum = 0.0;
        // Записать выходные данные в файл.
        FileWriter fout = new FileWriter("Test.txt");
        // Сохранить значения в списке, разделяя их запятыми.
        fout.write("2, 3.4,      5, 6, 7.4, 9.1, 10.5, done");
        fout.close();
        FileReader fin = new FileReader("Test.txt");
        Scanner src = new Scanner(fin);
        // Установить пробел и запятую в качестве разделителей.
        src.useDelimiter(", *");
        // Читать и суммировать числа.
        while (src.hasNext()) {
            if (src.hasNextDouble()) {
                sum += src.nextDouble();
                count++;
            } else {
                String str = src.next();
                if (str.equals("done")) break;
                else {
                    System.out.println("Ошибка формата файла.");
                    return;
                }
            }
        }
        src.close();
        System.out.println("Среднее значение равно  " + sum / count);
    }
}
