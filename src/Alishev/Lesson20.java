package Alishev;

// Урок 21. Ключевое слово static
public class Lesson20 {
    public static void main(String[] args) {
       Human20.description20 = "Nice";
       Human20.getDescripnion();
       Human20 h1 = new Human20("Bob", 40);

    }

}

class Human20 {
    private String name20;
    private int age20;

    public static String description20;


        public Human20(String name20, int age20) {
        System.out.println("Привет из третьего конструктора!");
        this.name20 = name20;
        this.age20 = age20;
    }

    public void setName20(String name20) {
        this.name20 = name20;
    }

    public void setAge20(int age20) {
        this.age20 = age20;
    }

    public static void getDescripnion() {
        System.out.println(description20);
    }
}