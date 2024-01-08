package chapter_1_7;

// В этой версии класса Box1 один объект допускается
// иницилизировать другим объектом
public class Box1 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор. В качестве
    // параметра в нем используется объект типа Box1
    Box1(Box1 ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, используемый, когда
    // указываются все размеры
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из
    // разеров не указан
    Box1() {
        width = -1; // использовать значение - 1 для
        height = -1;// обозначения неиницилизированного
        depth = -1; // параллелепипеда
    }

    // конструктор, используемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        // создать параллелепипеды, используя
        // разные конструкторы
        Box1 mybox1 = new Box1(10, 20, 15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclone = new Box1(mybox1);

        // создать копию объекта mybox1
        double vol;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем куба равен " + vol);

        // получить объем клона
        vol = myclone.volume();
        System.out.println("Объем клона равен " + vol);
    }
}
