package Java_H_Schildt.chapter_1_8;

// Теперь в классе BoxWeight  ключевое слово super
// используется для иниилизации собственных
// свойств объекта типа Box
class BoxWeight1 extends Box {
    double weight;// вес параллелепипеда

    // иницилизировать поля width, height и depth
    // с помощью метода super()
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); // вывать констрктор суперкласса
        weight = m;
    }
}
