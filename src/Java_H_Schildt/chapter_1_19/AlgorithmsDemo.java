package Java_H_Schildt.chapter_1_19;
// Продемонстрировать применение различых
// алгоритмов коллекций

import java.util.*;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        // создать неиницилизированный связный список
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        // создать компаратор с обратным упорядочением
        Comparator<Integer> r = Collections.reverseOrder();

        // отсортировать список с помощью этого компаратора
        Collections.sort(ll, r);

        System.out.print("Список отсортирован в обратном порядке:");

        for (int i : ll)
            System.out.print(i + " ");

        System.out.println();

        // перетасовать список
        Collections.shuffle(ll);

        // вывести перетасованный список
        System.out.print("Список перетасован: ");

        for (int i : ll)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));
    }
}
