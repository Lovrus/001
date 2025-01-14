package Java_H_Schildt.chapter_1_8;
// Расширение класса BoxWeight включением в него
// поля стоимости доставки

// создать сначала класс Box
public class Box3 {
    private double widht;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box3(Box3 ob) {// передать объект конструктору
        widht = ob.widht;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании все размеров
    Box3(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый в отстутствие размеров
    Box3() {
        widht = -1; // значение -1 служит для обозначения
        height = -1; // неиницилизированного
        depth = -1; // параллелепипеда
    }

    // конструктор, применяемый при создании куба
    Box3(double len) {
        widht = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return widht * height * depth;
    }
}

// добавить поле веса
class Boxweight3 extends Box3 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    Boxweight3(Boxweight3 ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

    // конструктор, применяемы при указании всех параметров
    Boxweight3(double w, double h, double d, double m) {
        super(w, h, d); // вызвать конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    Boxweight3() {
        super();
        weight = -1;
    }

    // конструктор, применяемы при оздани куба
    Boxweight3(double len, double m) {
        super(len);
        weight = m;
    }
}

// добавить поле стоимости добавки
class Shipment extends Boxweight3 {
    double cost;

    // сконструировать клон объекта
    Shipment(Shipment ob) { // передать объет конструктору
        super((ob));
        cost = ob.cost;
    }

    // конструктор, используемы при указании всех параметров
    Shipment(double w, double h, double d,
             double m, double c) {
        super(w, h, d, m); // вызвать конструктор суперкласса
        cost = c;
    }

    // конструктор, применяеый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 =
                new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 =
                new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;
        vol = shipment1.volume();

        System.out.println("Объем shipment1 равен "
                + vol);
        System.out.println("Вес shipment1 равен "
                + shipment1.weight);
        System.out.println("Стоимость доставки: $"
                + shipment1.cost);
        System.out.println();
        vol = shipment2.volume();
        System.out.println("Объем shipment2 равен "
                + vol);
        System.out.println("Вес shipment2 равен "
                + shipment2.weight);
        System.out.println("Стоимость доставки: $"
                + shipment2.cost);
    }
}
