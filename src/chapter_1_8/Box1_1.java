package chapter_1_8;


// В этой программе наследование применяется
// для раширения класса Вох
class Box1_1 {
    double width;
    double heigth;
    double depth;

    // сконструировать клон объекта
    Box1_1(Box1_1 ob) { // передать объект конструктору
        width = ob.width;
        heigth = ob.heigth;
        depth = ob.depth;
    }

    // конструктор, примняемый при указании всех размеров
    Box1_1(double w, double h, double d) {
        width = w;
        heigth = h;
        depth = d;
    }

    // конструктор применяемый в остутствие размеров
    Box1_1() {
        width = -1; // значение -1 служит для обозначения
        heigth = -1; // неицилизированного
        depth = -1; // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box1_1(double len) {
        width = heigth = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * heigth * depth;
    }
}

// Теперь в классе BoxWeigh ключевое слово super
// используется для иницилизации собственных
// свойст объекта Box
class BoxWeight1_1 extends Box1_1 {
    double weight; // вес параллелепипеда

    // Иницилизировать поля width, heigth и depth
    // с помощью метода super()
    BoxWeight1_1(double w, double h, double d, double m) {
       super(w, h, d);
        weight = m;
    }
}

class DemoBoxWeight1_1{
    public static void main(String[] args) {
        BoxWeight1_1 mybox1 = new BoxWeight1_1(10, 20, 15, 34.3);
        BoxWeight1_1 mybox2 = new BoxWeight1_1(2, 3, 4, 0.076);
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
