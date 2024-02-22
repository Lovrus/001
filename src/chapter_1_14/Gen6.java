package chapter_1_14;

// Использование операции instanceof с иераргией обобщения классов.
public class Gen6<T> {
    T ob;

    Gen6(T o) {
        ob = o;
    }

    // Возвратить ob.
    T getOb() {
        return ob;
    }
}

// Подкласс Gen.
class Gen7<T> extends Gen6<T> {
    Gen7(T o) {
        super(o);
    }
}

// Демонстрация последствий идентификации типов во время
// выполнения для иерархии обобщенных классов.
class HierDemo3 {
    public static void main(String[] args) {
        //Создать объект Gen6 для Integer
        Gen6<Integer> iOb = new Gen6<Integer>(88);

        // Создать объект Gen7 для Integer
        Gen7<Integer> iOb2 = new Gen7<Integer>(99);

        // Создать объект Gen7 для String.
        Gen7<String> strOb2 = new Gen7<String>("Тест обобщений");

        // Выяснить, является ли iOb2 какой-то формой Gen7.
        if (iOb2 instanceof Gen7<?>)
            System.out.println("iOb2 - экземпляр Gen7");

        // Выяснить, яявляется ли iOb2 какой-то формой Gen6.

        if (iOb2 instanceof Gen6<?>)
            System.out.println("iOb2 - экземпляр Gen6");

        System.out.println();

        // Выяснить, является ли strOb2 экземпляром Gen7.
        if (strOb2 instanceof Gen7<?>)
            System.out.println("strOb2 - экземпляр Gen7");

        // Выяснить, является ли strOb2 является экземпляром Gen6.
        if (strOb2 instanceof Gen6<?>)
            System.out.println("strOb2 - экземпляр Gen6");

        System.out.println();

        // Выяснить, является ли iOb экземпляром Gen7, что не так.
        if (iOb instanceof Gen7<?>)
            System.out.println("iOb - экземпляр Gen7");

        // Выяснить, является ли iOb экземпляром Gen6, что так.
        if (iOb instanceof Gen6<?>)
            System.out.println("iOb - экземпляр Gen6");
    }
}
