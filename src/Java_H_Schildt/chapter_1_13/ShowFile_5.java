package Java_H_Schildt.chapter_1_13;
/* В этой версии программы ShowFile
оператор try с ресурсами применяется
для автоматического закрытия файла
 */

import java.io.*;

public class ShowFile_5 {
    public static void main(String[] args) {
        int i;

        // сначала убедиться, то имя файла указано
        if (args.length != 1) {
            System.out.println(
                    "Использование: ShowFile имя_файла");
            return;
        }

        // Ниже оператор try с ресурсами применяется
        // сначала для открытия, а затем для автоматического
        // зарытия файла по завершении блока  этого оператора
        try (FileInputStream fin_5 = new FileInputStream(args[0])) {
            do {
                i = fin_5.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
