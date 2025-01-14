package Java_H_Schildt.chapter_2_23;
// Отображение содержимого каталога.

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\Mydir";
        // Получить и управлять потоком каталога внутри блока try.
        try (DirectoryStream<Path> dirstrm =
                     Files.newDirectoryStream(Path.of(dirname))) {
            System.out.println("Каталог " + dirname);
            // Поскольку DirectoryStream расширяет Iterable,
            // для отображения содержимого
            // каталога можно использовать цикл for в стиле "for-each".
            for (Path entry : dirstrm) {
                BasicFileAttributes attribs =
                        Files.readAttributes(entry, BasicFileAttributes.class);
                if (attribs.isDirectory())
                    System.out.print("<KAT> ");
                else
                    System.out.print("      ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути: " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом.");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
