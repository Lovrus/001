package chapter_2_29;
// Пример использования CyclicBarrier.

import java.util.concurrent.*;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3, new BarAction());
        System.out.println("Начало");
        new Thread(new MyThread1(cb, "A")).start();
        new Thread(new MyThread1(cb, "B")).start();
        new Thread(new MyThread1(cb, "C")).start();
        new Thread(new MyThread1(cb, "X")).start();
        new Thread(new MyThread1(cb, "Y")).start();
        new Thread(new MyThread1(cb, "Z")).start();
    }
}

// Поток выполнения, в котором применяется CyclicBarrier.
class MyThread1 implements Runnable {
    CyclicBarrier cbar;
    String name;

    MyThread1(CyclicBarrier c, String n) {
        cbar = c;
        name = n;
    }

    public void run() {
        System.out.println(name);
        try {
            cbar.await();
        } catch (BrokenBarrierException exc) {
            System.out.println(exc);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }
}

// Объект этого класса вызывается, когда заканчивается CyclicBarrier.
class BarAction implements Runnable {
    public void run() {
        System.out.println("Барьер достигнут!");
    }
}
