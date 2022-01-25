package Alishev;

// Урок 21. Ключевое слово static. Продолжение,
public class Lesson20 {
    public static void main(String[] args) {

        Human20 h1 = new Human20("Bob", 40);
        Human20 h2 = new Human20("Tom", 30);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
Human20 h3 = new Human20("Rob", 50);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }

}

class Human20 {
    private String name20;
    private int age20;
    private static int countPeople;


    public Human20(String name20, int age20) {
        this.name20 = name20;
        this.age20 = age20;
        countPeople++;
    }

    public void setName20(String name20) {
        this.name20 = name20;
    }

    public void setAge20(int age20) {
        this.age20 = age20;
    }

    public void printNumberOfPeople() {
        System.out.println("Number of piople is " + countPeople);
    }
}
