package chapter_1_16;
// Простой пример приложения, основанного на модулях.

import chapter_1_16.SimpleMathFuncs;

public class MyModAppDemo {
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 является делителеи 10");
        System.out.println("Наименьший общий делитель для 35 и 105 равен " +
                SimpleMathFuncs.lcf(35, 105));
        System.out.println("Наибольший общий делитель для 35 и 105 ранве " +
                SimpleMathFuncs.gcf(35, 105));
    }
}
