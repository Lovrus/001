package chapter_1_15;

// Использование обобщенного функционального интерфейса с лямбда-выражениями.
// обобщенный функциональный интерфейс.
public interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        // Использовать версию String интерфейса SomeFunc.
        SomeFunc<String> reserve = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--)
                result += str.charAt(i);
            return result;
        };
        System.out.println("Строка Lambda с противоположным порядком следования символов: "
                + reserve.func("Lambda"));
        System.out.println("Строка Expression с противоположным порядком следования символов: " +
                reserve.func("Expression"));
        // Теперь использовать версию Integer интерфейса SomeFunc.
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++)
                result = i * result;
            return result;
        };
        System.out.println("Факториал 3 равен " + factorial.func(3));
        System.out.println("Факториал 5 равен " + factorial.func(5));
    }
}
