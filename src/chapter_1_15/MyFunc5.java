package chapter_1_15;

// Демонстрация использования ссылки на конструкто робобщенного класса.
// Теперь Func - обобщенный функциональный интерфейс.
public interface MyFunc5<T> {
    MyClass3<T> func(T n);
}

class MyClass3<T> {
    private final T val;

    // Конструктор, принимающий аргумент.
    MyClass3(T v) {
        val = v;
    }

    // Стандартный конструктор.
    MyClass3() {
        val = null;
    }

    //...
    T getVal() {
        return val;
    }

    ;
}

class ConstructorRefDemo2 {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass<T>.
        MyFunc5<Integer> myClassCons = MyClass3<Integer>::new;
        // Создать экземппляр MyClass<T> через эту ссылку на конструктор.
        MyClass3<Integer> mc = myClassCons.func(100);
        // Использовать только что созданный экземпляр MyClass<T>.
        System.out.println("val в mc равно " + mc.getVal());
    }
}
