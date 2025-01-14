package Java_H_Schildt.chapter_2_20;

import java.util.*;

import static jdk.internal.org.jline.keymap.KeyMap.display;

// Демонстрация использования класса Arrays.import java.util.*;
public class ArraysDemo {
    public static void main(String[] args) {
        // Рамзестить в памяти и иницилизировать массив.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = -3 * i;
        // Отобразить, отсортировать и снова отобразить содержимое массива.
        System.out.print("Исходное содержимое: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Содержимое после сортировки");
        display(array);
        // Заполнить массив и отобразить его содержимое.
        Arrays.fill(array, 2, 6, -1);
        System.out.print("Содержимое после вызова fill(): ");
        display(array);
        // Отсортировать массив и отобразить его содержимое.
        Arrays.sort(array);
        System.out.print("Содержимое после повторной сортировки: ");
        display(array);
        // Двоичный поиск значения -9.
        System.out.print("Значение -9 находится в позиции ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int[] array) {
        for (int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
