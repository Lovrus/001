package chapter_2_29;
// Простой пример использования блокировки.

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
