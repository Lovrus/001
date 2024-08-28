package chapter_2_29;
// Пример использования Phaser.
import java.util.concurrent.*;
public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phsr = new Phaser();
        int curPhase;
        System.out.println("Начало");
        new Thread(new MyThread1(cb, "A")).start();
        new Thread(new MyThread1(cb, "B")).start();
        new Thread(new MyThread1(cb, "C")).start();


    }
}
