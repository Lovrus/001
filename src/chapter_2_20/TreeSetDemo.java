package chapter_2_20;
// Демонстрация использования TreeSet.

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        // Создать дреововидный набор.
        TreeSet<String> ts = new TreeSet<>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
    }
}
