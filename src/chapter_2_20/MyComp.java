package chapter_2_20;
// Исполльзование специального компаратора.

import java.util.*;

// Обратный компаратор для строк.
class MyComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        // Обратить сравнение.
        return bStr.compareTo(aStr);
    }
    // Переопределять equals() и методы со стандартной реализацией не требуется
}

class ComDemo {
    public static void main(String[] args) {
        // Создать древовидный набор.
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        // Добавить элементы в древовидный набор.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // Отобразить элементы.
        for (String element : ts)
            System.out.print(element + " ");
        System.out.println();
    }
}
