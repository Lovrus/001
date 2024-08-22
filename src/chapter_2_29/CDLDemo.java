package chapter_2_29;
// Пример использования CountDownLatch.

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        System.out.println("Начало");
        new Thread(new MyThread(cd1)).start();
        try {
            cd1.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("Конец");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;

    MyThread(CountDownLatch c) {
        latch = c;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();// Декрементирует счетчик
        }
    }
}
