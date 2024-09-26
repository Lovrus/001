package chapter_2_30;
// Демонстрация потоковых операций.

import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String[] args) {
        // Создать список значений типа Integer.
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);
        System.out.println("Исходный список: " + myList);
// Получить поток для ArrayList.
        Stream<Integer> myStream = myList.stream();
        // Получить минимальное и максимальное значения с использованием
        // методов min(), max(), isPresent() и get().
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) System.out.println("Минимальное значение: " +
                minVal.get());

    }
}