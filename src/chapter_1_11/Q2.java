package chapter_1_11;

// Правильная реализация поставщика и потребителя
public class Q2 {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Исключение типа "
                        + "InterruptedException перехвачено");
            }

        System.out.println("Получено " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иселючение типа "
                        + "InterruptedException перехвачено");
            }

        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

class Producer2 implements Runnable {
    Q2 q2;

    Producer2 (Q2 q2) {
        this.q2 = q2;
        new Thread(this, "Поставщик").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            q2.put(i++);
        }
    }
}

class Consumer2 implements Runnable {
    Q2 q2;

    Consumer2  (Q2 q2) {
        this.q2 = q2;
        new Thread(this, "Потребитель").start();
    }

    public void run() {
        while (true) {
            q2.get();
        }
    }
}

class PCFixed {
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        new Producer2(q2);
        new Consumer2(q2);
        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
