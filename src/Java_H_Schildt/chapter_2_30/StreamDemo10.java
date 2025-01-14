package Java_H_Schildt.chapter_2_30;
// Демонстрация использования trySplit().

import java.util.*;
import java.util.stream.*;

public class StreamDemo10 {
    public static void main(String[] args) {
        // Создать список строк.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");
// Получить поток для ArrayList.
        Stream<String> myStream = myList.stream();
        // Получить сплитератор.
        Spliterator<String> splitItr = myStream.spliterator();
// Разбить на части splitItr.
        Spliterator<String> splitItr2 = splitItr.trySplit();
        // Если splitItr не удается разбить на части,
        // тогда сначала использовать splitItr2.
        if (splitItr2 != null) {
            System.out.println("Вывод из splitItr2: ");
            splitItr2.forEachRemaining((n) -> System.out.println(n));
        }
        // теперь использовать splitItr.
        System.out.println("\nВывод из splitItr: ");
        splitItr.forEachRemaining((n) -> System.out.println(n));
    }
}
