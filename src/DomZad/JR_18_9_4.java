package DomZad;
/*
Создаем человека
*/

public class JR_18_9_4 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public class Human implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Duck implements CanSwim, CanFly, CanRun {
        public void swim() {
        }

        public void fly() {
        }

        public void run() {
        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void run() {
        }

        public void swim() {
        }
    }

    public class Airplane implements CanFly {

        public void fly() {
        }
    }
}

