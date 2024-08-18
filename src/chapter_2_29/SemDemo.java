package chapter_2_29;
// Простой пример использования семафора.

import java.util.concurrent.*;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);
        new Thread(new IncThread(sem, "A")).start();
        new Thread(new DecThread(sem, "B")).start();
    }
}

// Общий ресурс.
class Shared {
    static int count = 0;
}
// Поток выполнения, который инкементирует счетчик (переменную count).
class IncThread implements Runnable {
    String name;
    Semaphore sem;
    IncThread (Semaphore s, String n) {
        sem = s;
        name = n;
    }
    public void run() {
        System.out.println("Запуск " + name);
        try {
            // Для начала получить разрешение.
            System.out.println(name + "ожидает разрешения.");
            sem.acquire();
            System.out.println(name + " получил разрешение.");
            // Теперь получить доступ к общему ресурсу.

        }
    }
}