package DomZad;
/*
Интерфейсы к классу Human
*/

public class JR_18_12_8 {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
    }

    public interface Worker {
        void workLazy();
    }

    public interface Businessman {
        void workHard();
    }

    public interface Secretary {
        void workLazy();
    }

    public interface Miner {
        void workVeryHard();
    }

    public static class Human implements Businessman, Worker, Secretary {

        public void workHard() {
        }

        public void workLazy() {
        }
    }
}

