package chapter_1_19;
// Использовать специальный компаратор

import java.util.*;

public class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        // выполнить сравнение в обратном пордке
        return bStr.compareTo(aStr);
    }
    // переопределять метод equals() не требуется
}

class CompDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String elements : ts)
            System.out.print(elements + " ");
        System.out.println();
    }
}
