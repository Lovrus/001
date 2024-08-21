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

    public void put(int i) {
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
    }

    public void run() {
        for (int i = 0; i < 20; i++)
            q.put(i);
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
    }

    public void run() {
        for (int i = 0; i < 20; i++)
            q.get();
    }
}

class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new Consumer(q), "Consumer").start();
        new Thread(new Producer(q), "Producer").start();
    }
}
