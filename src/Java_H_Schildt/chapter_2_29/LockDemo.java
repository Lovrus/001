package Java_H_Schildt.chapter_2_29;
// Простой пример использования блокировки.

import DomZad.JR_23_13_2;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new Thread(new LockThread(lock, "A")).start();
        new Thread(new LockThread(lock, "B")).start();
    }
}

// Общий ресурс.
class Shared2 {
    static int count = 0;
}

// Поток, который икрементирует count.
class LockThread implements Runnable {
    String name;
    ReentrantLock lock;

    LockThread(ReentrantLock lk, String n) {
        lock = lk;
        name = n;
    }

    public void run() {
        System.out.println("Начало " + name);
        try {
            // Заблокировать count.
            System.out.println(name + " ожидает блокировку count.");
            lock.lock();
            System.out.println(name + " блокирует count.");
            Shared2.count++;
            System.out.println(name + ": " + Shared2.count);
            // Разрешить переключение контекста, если это возможно.
            System.out.println(name + " в состоянии ожидания.");
            Thread.sleep(1000);
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } finally {
            // Снять блокировку.
            System.out.println(name + " снимает блокировку count.");
            lock.unlock();
        }
    }
}
