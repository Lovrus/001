package DomZad;
public interface Person2 {
    class User implements Person2 {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person2 {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person2 {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person2 {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}
