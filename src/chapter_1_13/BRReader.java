package chapter_1_13;
// Использовать класс BufferedReader для чтения
// символов с консоли

import java.io.*;

public class BRReader {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Введите символы, 'q' - для выхода."); // читать символы
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
