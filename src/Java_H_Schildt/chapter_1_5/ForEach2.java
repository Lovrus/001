package Java_H_Schildt.chapter_1_5;

import java.sql.SQLOutput;

// Применение оператора break  в цикле for в стиле for each
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // использовать цикл for в стиле for each для
        // вывода и суммирования значений из части массива
        for (int x : nums) {
            System.out.println("Значение равно: " + x);
            sum += x;
            if (x == 5) break; // прервать цикл после
            // получения 5 значений
        }
        System.out.println(
                "Сумма пяти первых элементов равна: " + sum);
    }
}
