package Java_H_Schildt.chapter_2_22;

import java.io.*;
import java.io.ByteArrayOutputStream;

// Демонстрация использования ByteArrayOutputStream
public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Эта строка в итоге должна оказаться в массиве";
        byte[] buf = s.getBytes();
        try {
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в буфер");
            return;
        }
        System.out.println("Буфер в виде строки:");
        System.out.println(f.toString());
        System.out.println("В массив:");
        byte[] b = f.toByteArray();
        for (int i = 0; i < b.length; i++) System.out.print((char) b[i]);
        System.out.println("\nВ поток вывода:");
        // Использовать для управления файловым потоком оператор try с ресурсамию
        try (FileOutputStream f2 = new FileOutputStream("text.txt")) {
            f.writeTo(f2);
        } catch (
                IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
            return;
        }
        System.out.println("Выполнение переустановки");
        f.reset();
        for (int i = 0; i < 3; i++) f.write('X');
        System.out.println(f.toString());
    }
}
