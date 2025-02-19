package Java_H_Schildt.chapter_1_13;
// Простейший текстовый редактор

import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader,
        // используя стандартны поток ввода System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String[] str = new String[100];
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }
        System.out.println("\nСодержимое вашего файла:");
        // вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
