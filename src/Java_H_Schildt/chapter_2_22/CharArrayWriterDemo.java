package Java_H_Schildt.chapter_2_22;
// Демонстрация использования CharArrayWriter.

import java.io.*;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Эта строка в итоге должна оказаться в массиве";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);
        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в буфер");
            return;
        }
        System.out.println("Буфер в виде строки:");
        System.out.println(f.toString());
        System.out.println("В массив:");
        char[] c = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println("\nВ объект FileWriter:");
        // Использовать для управления файловым потоком оператор try с ресурсами.
        try (FileWriter f2 = new FileWriter("test.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
        System.out.println("Выполнение переустановки");
        f.reset();
        for (int i = 0; i < 3; i++) f.write('X');
        System.out.println(f.toString());
    }
}
