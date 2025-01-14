package Java_H_Schildt.chapter_2_23;
// Использование канального ввода-вывода для чтения файла.

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;

public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;
        // Сначала получить путь к файлу.
        try {
            filepath = Path.of("test.txt");
        } catch (InvalidPathException e) {
            System.out.println("Ошибка в пути: " + e);
            return;
        }
        // Затем получить канал к этому файлу внутри блока try с ресурсами.
        try (SeekableByteChannel fChan = Files.newByteChannel(filepath)) {
            // Выделить память под буфер.
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                // Читать данные в буфер.
                count = fChan.read(mBuf);
                // Остановиться, когда достигнут конец файла.
                if (count != -1) {
                    // Перестановить буфер в начало, чтобы из него можно было читать.
                    mBuf.rewind();
                    // Прочитать байты из буфера и отобразить их на экране как символы.
                    for (int i = 0; i < count; i++)
                        System.out.println((char) mBuf.get());
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
