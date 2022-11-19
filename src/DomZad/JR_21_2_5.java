package DomZad;
/*
ООП - исправь ошибки в наследовании
*/

public class JR_21_2_5 {
    public interface HasWeight {
        int getWeight();
    }

    public interface HasHeight {
        int getHeight();
    }

    public static class Human implements HasWeight, HasHeight {
        @Override
        public int getWeight() {
            return 75;
        }

        @Override
        public int getHeight() {
            return 180;
        }
    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.getWeight());
        System.out.println(human.getHeight());
    }
}
