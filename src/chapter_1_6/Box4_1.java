package chapter_1_6;
// Убрана переменная vol которая была в Box4

public class Box4_1 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4_1 {
    public static void main(String[] args) {
        Box4_1 mybox1 = new Box4_1();
        Box4_1 mybox2 = new Box4_1();

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* присвоидть другие значения переменным
        экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипеда
        System.out.println("Объем равен " + mybox1.volume());

        // получить объем второго параллелепипеда
        System.out.println("Объем равен " + mybox2.volume());
    }
}
