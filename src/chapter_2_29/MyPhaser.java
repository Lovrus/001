package chapter_2_29;
// Пример расширения класса Phaser и переопределения метода onAdvance(),
// чтобы выполнялось только заданное количество стадий.
import java.util.concurrent.*;
// Расширить класс MyPhaser, чтобы разрешить выполнение
// только указанного количества стадий.
public class MyPhaser extends Phaser {
    int numPhases;

}
