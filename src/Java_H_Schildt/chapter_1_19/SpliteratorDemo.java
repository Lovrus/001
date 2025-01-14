package Java_H_Schildt.chapter_1_19;
// Продемонстрировать простое применение интерфейса Spliterator

import java.util.*;

public class SpliteratorDemo {

    public static void main(String[] args) {
        // создать списочнй массив числовых значений
        // типа double
        ArrayList<Double> vals = new ArrayList<Double>();

        // ввести значения в списочный массив
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // вызвать метод tryAdvance() для вывода содержимого
        // списочного массива
        System.out.print("Содержимое списочного массива vals:\n");
        Spliterator<Double> spltitr = vals.spliterator();
        while (spltitr.tryAdvance((n) ->
                System.out.println(n))) ;
        System.out.println();

        // создать новый списочный массив,
        // содержащий квадратные корни числовых
        // значений из списочного массива vals
        spltitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spltitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;

        // вызвать метод forEachRemaining() для вывода
        // содержимого списочного массива sqrs
        System.out.print(
                "Содержимое списочного массива sqrs:\n");
        spltitr = sqrs.spliterator();
        spltitr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();
    }
}
