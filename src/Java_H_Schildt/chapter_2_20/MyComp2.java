package Java_H_Schildt.chapter_2_20;

import java.util.*;

// Обратный компаратор для строк.
public class MyComp2 implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        // Обратить сравнение.
        return aStr.compareTo(bStr);
    }
    // Переопределять equals() и методы со стандартной реализацией не требуется
}

class ComDemo2 {
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
