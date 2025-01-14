package Java_H_Schildt.chapter_1_13;
// Воспользоваться статическим импортом для доступа
// к встроенным в Java методам sqrt() и pow()

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// вычислить гопотенузу прямоугольного треугольника

public class Hypot_2 {
    public static void main(String[] args) {
        double side1, side2;
        double hypot;

        side1 = 3.0;
        side2 = 4.0;

        // Здесь методы sqrt() и pow() можно вызывать
        // непосредственно, опуская имя их класса
        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("При заданной длине сторон "
                + side1 + " и " + side2
                + " гипотенуза равна " + hypot);
    }
}
