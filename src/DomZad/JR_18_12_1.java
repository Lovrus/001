package DomZad;
/*
Все мы немного кошки…
*/

public class JR_18_12_1 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        public String getName() {
            return "Я - кот";
        }


    }
}
