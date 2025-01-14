package Java_H_Schildt.chapter_2_29;
// Простой пример использования атомарных операций.

import java.util.concurrent.atomic.*;

public class AtomicDemo {
    public static void main(String[] args) {
        new Thread(new AtomThread("A")).start();
        new Thread(new AtomThread("B")).start();
        new Thread(new AtomThread("C")).start();
    }
}

class Shared3 {
    static AtomicInteger ai = new AtomicInteger(0);
}

// Поток выполнения, который инкрементирует счетчик.
class AtomThread implements Runnable {
    String name;

    AtomThread(String n) {
        name = n;
    }

    public void run() {
        System.out.println("Начало " + name);
        for (int i = 1; i <= 3; i++)
            System.out.println(name + " получено: " + Shared3.ai.getAndSet(i));
    }
}
