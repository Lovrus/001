package Java_H_Schildt.chapter_2_30;
// Демонстрация использования объединяющей функции посредством reduce().

import java.util.*;
import java.util.stream.*;

public class StreamDemoЗ {
    public static void main(String[] args) {
        // Список значений double.
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
        double productOfSqrRoots = myList.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b),
                (a, b) -> a * b
        );
        System.out.println("Произведение квадратный корней: " + productOfSqrRoots);
        // Не работает.
        double productOfSqrRoots2 = myList.parallelStream().reduce(
                1.0,
                (a, b) -> a * Math.sqrt(b));
        System.out.println("Произведение аккумуляриющее: " + productOfSqrRoots2);
    }
}
