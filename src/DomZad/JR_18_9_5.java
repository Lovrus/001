package DomZad;
/*
Класс Human и интерфейсы CanRun, CanSwim
*/

public class JR_18_9_5 {
    public static void main(String[] args) {

    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public abstract class Human implements CanRun, CanSwim {

    }
}
