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
