package Java_H_Schildt.chapter_1_6;

// Сокрытие переменных экземпляра
public class Box7_2 {
    double width;
    double height;
    double depth;

    // В этом коде разрешаются конфликты в пространстве имен
    Box7_2(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7_2 {
    public static void main(String[] args) {
        // объявить, выделить память и иницилизировать
        // объекты типа Box7_1
        Box7_2 mybox1 = new Box7_2(10, 20, 15);
        Box7_2 mybox2 = new Box7_2(3, 6, 9);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем первого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
