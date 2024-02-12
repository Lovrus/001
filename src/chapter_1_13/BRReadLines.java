package chapter_1_13;
// Чтение символьных строк с консоли средствами
// класа BufferedReader

import java.io.*;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader,
        // используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String str;
        System.out.println("Введите строки текста.");
        System.out.println("Введите 'стоп' для завершения.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
}
