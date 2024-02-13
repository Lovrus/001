package chapter_1_13;
/* Отображение содержимого текстового файла.
чтобы воспользоваться этой программой, укажите
имя файла, который требуется просмотреть.
Например, чтобы просмотреть файл TEST.TXT,
введите в командной строке следующую команду:

java Showfile TEST.TXT

В этом варианте программы код, открыващий и получающий
доступ к файлу, заключен в один блок оператора try.
Файл закрывается в блоке оператора finally.
 */

import java.io.*;

public class ShowFile_3 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin3 = null;

        // сначала убедиться, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // В следующем фрагменте кода сначала открывается файл,
        // а затем из него читаются символы до тех пор, пока
        // не встретится признак конца файла
        try {
            fin3 = new FileInputStream(args[0]);

            do {
                i = fin3.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден,");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            // закрыть файл в любом случае
            try {
                if (fin3 != null) fin3.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
