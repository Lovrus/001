package Java_H_Schildt.chapter_1_19;
// Продемонстрировать применения класса ArrayDeque


import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстроронню очередь
        ArrayDeque<String> adq = new ArrayDeque<>();

        // использовать класс ArrayDeque для организации стека
        adq.push("A");
        adq.push("B");
        adq.push("D");
        adq.push("E");
        adq.push("F");

        System.out.print("Извлечение из стека: ");

        while (adq.peek() != null)
            System.out.print(adq.pop() + " ");

        System.out.println();
    }
}
