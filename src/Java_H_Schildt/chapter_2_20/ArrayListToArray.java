package Java_H_Schildt.chapter_2_20;
// Преобразовать ArrayList в массив.

import java.util.*;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        // Добавить элементы в списковый массив.
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        System.out.println("Солдержимое массива a1: " + a1);
        // Получить массив.
        Integer[] ia = new Integer[a1.size()];
        ia = a1.toArray(ia);
        int sum = 0;
        // Просумирровать элементы массива.
        for (int i : ia) sum += i;
        System.out.println("Сумма элементов массива: " + sum);
    }
}
