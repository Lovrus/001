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

    // конструктор применяемый при остутствии размеров
    Box() {
        width - -1; // значение -1 служит для обозначения
        heigth = -1; // неицилизированного
        depth = -1 // параллелепипеда
        }

        // конструктор, применяемый при создании куба
    Box(double len) {
        width = heigth = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return  width*heigth*depth;
    }
}
// рассчитать класс Box, включив в него пол веса
class BoxWeight extends Box {
    double weight; // вес параллелепипеда

    // конструктор BoxWeight ()
    BoxWeight(double w, double h, double d, double m) {
        weight = w;
        heigth = h;
        depth = d;
        weight = m;
    }
}
public class DemoWeight {
    public static void main(String[] args) {

    }
    }

)