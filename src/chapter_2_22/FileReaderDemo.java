package chapter_2_22;

import java.io.FileReader;
import java.io.IOException;

// Демонстрация использования FileReader.
public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("FileReaderDemo.java")) {
            int c;
            // Просчитать и отобразить содержимое файла.
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
