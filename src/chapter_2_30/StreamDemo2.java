package chapter_2_30;
// Демонстрация использования метода reduce().

import java.util.*;
import java.util.stream.*;

public class StreamDemo2 {
    public static void main(String[] args) {
        // создать список типа Integer.
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(7);
        mylist.add(18);
        mylist.add(10);
        mylist.add(24);
        mylist.add(17);
        mylist.add(5);
        // Два способа получения целочисленного произведения элементов
        // в myList с использованием reduce().
        Optional<Integer> productIbj = mylist.stream().reduce((a, b) -> a * b);
        if (productIbj.isPresent())
            System.out.println("Произведение как Optional: " + productIbj.get());
        int product = mylist.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Произведение как int: " + product);
    }
}
