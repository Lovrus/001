package chapter_2_29;
// Реализация производителя и потребителя, в которой
// для управления синхронизицией используются семафоры.

import java.util.concurrent.Semaphore;

public class Q {
    int n;
    // Начать с недоступным семафором потребителя.
    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get() {
        try {
            semCon.acquire();
        } catch (InterruptedException e) {
            System.out.println("Перехвачено исключение InterruptedException");
        }
        System.out.println("Получено: " + n);
        semProd.release();
    }
}
