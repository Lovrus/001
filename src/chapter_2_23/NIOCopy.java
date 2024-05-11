package chapter_2_23;
// Копирование файла с использованием системы NIO.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class NIOCopy {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Использование : сору исходный-файл целевой-файл");
            return;
        }
        try {
            Path source = Path.of(args[0]);
            Path target = Path.of(args[1]);
            // Копировать файл.
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути: " + e);
        } catch (IOException е) {
            System.out.println("Ошибка ввода-вывода : " + е);
        }
    }
}
