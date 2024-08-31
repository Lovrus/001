package chapter_2_29;
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
