package chapter_2_23;
/* Отображение содержимого текстового файла с применением потокового
ввода-вывода на основе NIO.
Дпя использования программы укажите имя файла , который хотите просмотреть.
На пример, чтобы увидеть содержимое файла по имени TEST. TXT,
введите следующую командную строку:
java ShowFile TEST. TXT
*/

import java.io.*;
import java.nio.file.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        // Удостовериться, что имя файла было указано.
        if (args.length != 1) {
            System.out.println("Использование: ShowFile имя файла");
            return;
        }
        //Открыть файл и получить связанный с ним поток.
        try (InputStream fin = Files.newInputStream(Path.of(args[0]))) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
