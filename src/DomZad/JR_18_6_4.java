package DomZad;
/*
Корова — тоже животное
*/

public class JR_18_6_4 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {

        public String getName() {
            return "Корова";
        }
    }
}
