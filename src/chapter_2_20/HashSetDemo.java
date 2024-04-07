package chapter_2_20;

import java.util.HashSet;

// Демонстрация работы HashSet.
public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-таблицу.
        HashSet<String> hs = new HashSet<>();
        // Добавить элементы в хеш-таблицу.
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");
        System.out.println(hs);
    }
}
