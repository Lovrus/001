package DomZad;

/*
Кошачья бойня(3)
*/
public class JR_10_2_3 {

    public static void main(String[] args) {
        JR_10_2_3.Cat cat1 = new JR_10_2_3.Cat("Tom", 2, 2, 2);
        JR_10_2_3.Cat cat2 = new JR_10_2_3.Cat("Sam", 2, 2, 2);
        JR_10_2_3.Cat cat3 = new JR_10_2_3.Cat("Fiona", 3, 3, 3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageScore = Integer.compare(this.age, anotherCat.age);
            int weightScore = Integer.compare(this.weight, anotherCat.weight);
            int strengthScore = Integer.compare(this.strength, anotherCat.strength);

            int score = ageScore + weightScore + strengthScore;
            return score > 0;
        }
    }
}

