package DomZad;
/*
Кошки не должны быть абстрактными!
*/

public class JR_18_6_5 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {

        public String getName() {
            return "Кот";
        }

        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {

        public String getName() {
            return "Собака";
        }

        public Pet getChild() {
            return new Dog();
        }
    }
}
