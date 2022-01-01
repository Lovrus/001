package Alishev;

// Урок 19. Ключевое слово this
public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge19(18);
        human1.setName19("Tom");
        human1.getInfo19();
    }
}

class Human {
    String name19;
    int age19;

    public void setName19(String theName19) {

        name19 = theName19;
    }

    public void setAge19(int myAge19) {

        age19 = myAge19;
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