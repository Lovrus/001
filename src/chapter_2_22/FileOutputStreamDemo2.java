package chapter_2_22;
// Демонстрация использования FileOutputStream.
// В этой версии программы применяется оператор try с ресурсами.

import java.io.*;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) {
        String source = "Настало время всем порядочным людям\n"
                + " прийти на помощь своей стране\n"
                + " и заплатить надлежащие налоги";
        byte[] buf = source.getBytes();
        // Использовать для закрытия файлов оператор try с ресурсами.
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")) {
            // Записать в первый файл.
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);
            // Записать во второй файл.
            f1.write(buf);
            // Записать в третий файл.
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);
        } catch (IOException e) {
            System.out.println("Возникла ошибка ввода-вывода");
        }
    }
}
