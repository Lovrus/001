package chapter_1_15;

import java.util.function.Function;

// Использование встроенного функционального интерфейса Function.
// Испортировать интерфейс Function.
public class UseFunctionInterfaceDemo {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет факториал значение int.
        // теперь функциональным интерфейсом является Function.
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал 3 равен " + factorial.apply(3));
        System.out.println("Факториал 5 равен " + factorial.apply(5));
    }
}
