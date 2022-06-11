package chapter_1_13;

import java.io.*;

public class ShowFile_4 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin4 = null;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        try {
            fin4 = new FileInputStream(args[0]);

            do {
                i = fin4.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        } finally {
            // закрыть файл в любом случае
            try {
                if (fin4 != null) fin4.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}

