package chapter_1_8;

// В этой программе наследование применяется
// для раширения класса Вох
class Box {
    double width;
    double heigth;
    double depth;

    // сконструировать клон объекта
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }

    // конструктор, примняемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    // конструктор применяемый в остутствие размеров
    Box() {
        width = -1; // значение -1 служит для обозначения
        heigth = -1; // неицилизированного
        depth = -1; // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box(double len) {
        width = heigth = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * heigth * depth;
    }
}

// расширить класс Box, включив в него поле веса
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // конструктор BoxWeight ()
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        heigth = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println(
                "Вес mybox1 равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println(
                "Вес mybox2 равен " + mybox2.weight);
    }
}

// Этот класс расширяет класс Box,
// включая в него свойство цвета
class ColorBox extends Box {
    int color; // цвет параллелепипеда

    ColorBox(double w, double h, double d, int c) {
        width = w;
        heigth = h;
        depth = d;
        color = c;
    }
}
