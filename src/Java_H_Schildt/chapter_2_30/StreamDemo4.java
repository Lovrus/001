package Java_H_Schildt.chapter_2_30;
// Сопоставление одного потока с другим.

import java.util.*;
import java.util.stream.*;

public class StreamDemo4 {
    public static void main(String[] args) {
        // Список значений типа double.
        ArrayList<Double> mylist = new ArrayList<>();
        mylist.add(7.0);
        mylist.add(18.0);
        mylist.add(10.0);
        mylist.add(24.0);
        mylist.add(17.0);
        mylist.add(5.0);
// Сопоставить квадратные корни элементов в myList с новым потоком.
        Stream<Double> sqrtRootStrm = mylist.stream().map((a) -> Math.sqrt(a));
        // Найти произведение квадратных корней.
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);
        System.out.println("Произведение квадратных корней: " + productOfSqrRoots);
    }
}

