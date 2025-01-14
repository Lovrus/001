package Java_H_Schildt.chapter_2_23;
// Использование сопоставления файла с буфером для чтения файла.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class MappedChannelRead {
    public static void main(String[] args) {
        // Получить канал к файлу внутри блока try с ресурсами.
        try (FileChannel fChan =
                     (FileChannel) Files.newByteChannel(Path.of("test.txt"))) {
            // Получить размер файла.
            long fSize = fChan.size();
            // Сопоставить файл с буфером.
            MappedByteBuffer mBuf =
                    fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            // Прочитать байты из буфера и отобразить их на экране как символы.
            for (int i = 0; i < fSize; i++)
                System.out.print((char) mBuf.get());
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути: " + e);
        } catch (IOException e) {
            System.out.println("ОШибка ввода-вывода: " + e);
        }
    }
}
