package DomZad;

/*
Конструируем котиков
*/
public class JR_10_6_5 {

    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public JR_10_6_5(String name) {
        this.age = 5;
        this.name = name;
        this.weight = 5;
        this.color = "White";
    }

    public JR_10_6_5(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Red";
    }

    public JR_10_6_5(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 5;
        this.color = "Grey";
    }

    public JR_10_6_5(int weight, String color) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public JR_10_6_5(int weight, String color, String address) {
        this.age = 5;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}


