package Java_H_Schildt.chapter_1_7;

/* В данном примере конструкторы определяются
в классе Box для иницилизации размеров
параллелепипеда тремя разными способами
 */
public class Box {
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда
    // указываеются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда
    // ни один из рамеров не указан
    Box() {
        width = -1; // использовать значение - 1 для
        height = -1; // обозначения неинийилизированного
        depth = -1; // параллелепипеда
    }

    // конструктор, используемы при создании куда
    Box(double len) {
        width = height = depth = len;
    }

    // расчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        // создать параллелепипеды, используя разные
        // конструкторы
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        //получить объем первого параллелелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
