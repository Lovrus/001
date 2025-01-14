package Java_H_Schildt.chapter_1_6;

/* В данном примере программы для иницилизации
размеров параллелепипеда в классе Box7 применяется
параметризированный конструктор
*/
public class Box7 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box7
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo7 {
    public static void main(String[] args) {
        // объявить, выделить память и иницилизировать
        // объекты типа Box7
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3, 6, 9);

        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем первого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
