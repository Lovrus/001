package chapter_2_23;
// Более компактный способ открытия канала.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class ExplicitChannelRead2 {
    public static void main(String[] args) {
        int count;
        // Здесь канал открывается на объекте реализации Path,
        // возвращенном методом Path.of().
        // Нет необходимости в переменной filepath.
        try (SeekableByteChannel fChan =
                     Files.newByteChannel(Path.of("test.txt"))) {
            // Выделить память под буфер.
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                // Читать данные во буфер.
                count = fChan.read(mBuf);
                //Остановиться, когда достигнут конец файла.
                if (count != -1) {
                    // Переустановить буфер в начало, чтобы и него можно было читать.
                    mBuf.rewind();
                    // Прочитать байты из буфера и отобразить их на экране как символы.
                    for (int i = 0; i < count; i++)
                        System.out.print((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();
        } catch (InvalidPathException e) {
            System.out.println("Ошибки в пути: " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
