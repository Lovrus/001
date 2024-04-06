package chapter_2_20;

import java.util.ArrayList;

// Демонстрация использования ArrayList.
public class ArrayListDemo {
    public static void main(String[] args) {
        // Создать списковый массив.
        ArrayList<String> a1 = new ArrayList<String>();
        System.out.println("Начальный размер a1: " + a1.size());
        // Добавить элементы в списковый массив.
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");
        System.out.println("Размер а1 после добавления элементов: " + a1.size());
        // Отобразить списковый массив.
        System.out.println("Содержимое a1: " + a1);
        // Удалить элементы из спискового массива.
        a1.remove("F");
        a1.remove(2);
        System.out.println("Размер а1 после удаления элементов: " + a1.size());
        System.out.println("Содержимое а1: " + a1);
    }
}
