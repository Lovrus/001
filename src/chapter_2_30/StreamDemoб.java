package chapter_2_30;
// Сопоставление Stream с IntStream.

import java.util.*;
import java.util.stream.*;

public class StreamDemoб {
    public static void main(String[] args) {
        // Споисок значений типа double.
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);
        System.out.println("Исходные элементы myList: ");
        myList.stream().forEach((a) -> {
            System.out.println(a + " ");
        });
        System.out.println();
        // Сопоставить ближайшие большие целые значения для элементов
        // в myList с IntStream.

    }
}
