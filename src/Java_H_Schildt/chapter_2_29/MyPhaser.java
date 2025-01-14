package Java_H_Schildt.chapter_2_29;
// Пример расширения класса Phaser и переопределения метода onAdvance(),
// чтобы выполнялось только заданное количество стадий.

import java.util.concurrent.*;

// Расширить класс MyPhaser, чтобы разрешить выполнение
// только указанного количества стадий.
public class MyPhaser extends Phaser {
    int numPhases;

    MyPhaser(int parties, int phaseCount) {
        super(parties);
        numPhases = phaseCount - 1;
    }

    // Переопределить метод onAdvance() для выполенения указанного
    // количества стадий.
    protected boolean onAdvance(int p, int regParties) {
        // Этот оператор println() предназначен только для иллюстративных целей
        // Обычно метод onAdvance() ничего не отображает.
        System.out.println("Стадия " + p + " завершена.\n");
        // Если все стадии завершены, тогда возвратить true.
        if (p == numPhases || regParties == 0) return true;
        // В противном случае возвратить false.
        return false;
    }
}

class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phsr = new MyPhaser(1, 4);
        System.out.println("Начало\n");
        new Thread(new MyThread3(phsr, "A")).start();
        new Thread(new MyThread3(phsr, "B")).start();
        new Thread(new MyThread3(phsr, "C")).start();
        // Ожидать завершерния указанного количества стадий.
        while (!phsr.isTerminated()) {
            phsr.arriveAndAwaitAdvance();
        }
        System.out.println("Объект Phaser закончил работу.");
    }
}

// Поток выполнения, который использует Phaser.
class MyThread3 implements Runnable {
    Phaser phsr;
    String name;

    MyThread3(Phaser p, String n) {
        phsr = p;
        name = n;
        phsr.register();
    }

    public void run() {
        while (!phsr.isTerminated()) {
            System.out.println("Поток " + name + " начинает стадию " +
                    phsr.getPhase());
            phsr.arriveAndAwaitAdvance();
            // Организовать небольшую паузу, чтобы предотвратить беспорядочный
            // вывод. Это делается только в целях иллюстрации и не требуется
            // для корректной работы объекта Phaser.
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
