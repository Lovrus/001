package DomZad;

/*
Мужчина и женщина
*/
public class JR_10_9_2 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Man man = new Man("Oleg", 23, "New-York, 228 Park Ave");
        Man man1 = new Man("Senya", 15, "Seattle, 132 5th Ave");
        Woman woman = new Woman("Latya", 35, "California, 233 Center Street");
        Woman woman1 = new Woman("Kristina", 23, "Springfield, 12 6th Street");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        public String toString() {
            return (name + " " + age + " " + address);
        }
    }
}
