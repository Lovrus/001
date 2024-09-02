package chapter_2_29;
// Простой пример применения исполнителя.

import java.util.concurrent.*;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd12 = new CountDownLatch(5);
        CountDownLatch cd13 = new CountDownLatch(5);
        CountDownLatch cd14 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(2);
        System.out.println("Начало");
        // Запустить потоки.
        es.execute(new MyThread4(cd1, "A"));
        es.execute(new MyThread4(cd12, "B"));
        es.execute(new MyThread4(cd13, "C"));
        es.execute(new MyThread4(cd14, "D"));
        try {
            cd1.await();
            cd12.await();
            cd13.await();
            cd14.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        es.shutdown();
        System.out.println("Конец");
    }
}

class MyThread4 implements Runnable {
    String name;
    CountDownLatch latch;

    MyThread4(CountDownLatch c, String n) {
        latch = c;
        name = n;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}

