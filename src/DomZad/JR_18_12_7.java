package DomZad;
/*
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class JR_18_12_7 {
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

    public class Duck implements CanSwim, CanRun, CanFly {
        public void fly() {
        }

        public void swim() {
        }

        public void run() {
        }
    }

    public class Penguin implements CanSwim, CanRun {
        public void swim() {
        }

        public void run() {
        }
    }

    public class Toad implements CanSwim {
        public void swim() {
        }
    }
}
