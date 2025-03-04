package Java_H_Schildt.chapter_1_19;
// Продемонстрировать применение класса LinkedList

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // созать связный список
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");

        ll.add(1, "A2");

        System.out.println("Исходное содержимое связного "
                + "списка ll: " + ll);

        ll.remove("F"); // удалить указанные элементы
        ll.remove(2); // из связного списка
        System.out.println("Содержимое связного списка ll "
                + "после удаления элеметов: " + ll);

        ll.removeFirst(); // удалить первый и последний
        ll.removeLast(); // элементы из связного списка

        System.out.println("Содержимое связного списка ll "
                + "после удаления первого и "
                + "последнего элементов: " + " " + ll);

        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");

        System.out.println("Содержимое связного списка ll "
                + "после изменения: " + ll);
    }
}
