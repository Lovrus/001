package chapter_1_13;

import java.io.*;

public class ShowFile_2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fins;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println(
                    "Использование ShowFile имя_файла");
            return;
        }
// Попытка открыть файл
        try {
            fins = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        try {
            do {
                i = fins.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            // закрыть файл при выходе из блока оператора try
            try {
                fins.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}


