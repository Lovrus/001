package Alishev;

// Урок 19. Ключевое слово this
public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge19(18);
        human1.setName19("Tom");
        human1.getInfo19();
        Human human2 = new Human();
        human2.setAge19(25);
        human2.setName19("Bob");
        human2.getInfo19();
    }
}

class Human {
    String name19;
    int age19;

    public void setName19(String name19) {

        this.name19 = name19;
    }

    public void setAge19(int age19) {

        this.age19 = age19;
    }

    public String getName19() {
        return name19;
    }

    public int getAge19() {
        return age19;
    }

    public void getInfo19() {
        System.out.println(name19 + " " + age19);
    }
}
