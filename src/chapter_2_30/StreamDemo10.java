package chapter_2_30;
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

    }
}
