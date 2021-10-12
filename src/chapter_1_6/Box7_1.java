package chapter_1_6;

// Использование слова this
public class Box7_1 {
    double width;
    double height;
    double depth;

    // Избыточное применение ключевого слова this
    Box7_1(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7_1 {
    public static void main(String[] args) {
        // объявить, выделить память и иницилизировать
        // объекты типа Box7_1
        Box7_1 mybox1 = new Box7_1(10, 20, 15);
        Box7_1 mybox2 = new Box7_1(3, 6, 9);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем первого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}