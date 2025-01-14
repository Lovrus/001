package Java_H_Schildt.chapter_2_20;
// Демонстрация работы разнообразных алгоритмов.

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // Создать и иницилизировать связных список.
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        // Создать компаратор с обратным порядком.
        Comparator<Integer> r = Collections.reverseOrder();
        // Сортировать список с использованием созданного компаратора.
        Collections.sort(ll, r);
        System.out.print("Список отсортирован в обратном порядке: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        // Тасовать список.
        Collections.shuffle(ll);
        // Отобразить рандомизированный список.
        System.out.print("Список перетасован: ");
        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Наименьшее значение: " + Collections.min(ll));
        System.out.println("Наибольшее значение: " + Collections.max(ll));
    }
}
