package Java_H_Schildt.chapter_2_30;
// Использование сплитератора.

import java.util.*;
import java.util.stream.*;

public class StreamDemo9 {
    public static void main(String[] args) {
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
        // Пройти по элементам в потоке.
        while (splitItr.tryAdvance((n) -> System.out.println(n))) ;
    }
}
