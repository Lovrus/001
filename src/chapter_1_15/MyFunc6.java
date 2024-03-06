package chapter_1_15;

// Реализация простой фабрики классов с использованием ссылки на конструктор.
public interface MyFunc6<R, T> {
    R func(T n);
}

// Простой обобщенный класс.
class MyClass4<T> {
    private T val;

    // Конструктор, принимающий аргумент.
    MyClass4(T v) {
        val = v;
    }

    // Стандартный констркуктор. В этой программе не используется.
    MyClass4() {
        val = null;
    }

    //...
    T getVal() {
        return val;
    }

    ;
}

// Простой необобщенный класс.
class MyClass5 {
    String str;

    // Конструктор, принимающий аргумент.
    MyClass5(String s) {
        str = s;
    }

    // Стандартный конструктор. В этой программе НЕ используется.
    MyClass5() {
        str = "";
    }

    //...
    String getVal() {
        return str;
    }

    ;
}

class ConstructorRefDemo3 {
    // Фабричный метод для объектов класса. Класс обязан иметь
    // конструктор, который принимает один параметр типа Т.
    // Тип создаваемоего объекта указывается в R.
    static <R, T> R myClassFactory(MyFunc6<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass.
        // В этом случае new ссылается на конструктор, принимающий аргумент.
        MyFunc6<MyClass4<Double>, Double> myClassCons = MyClass4<Double>::new;

        // Создать экземпляр MyClass с применением фабричного метода.
        MyClass4<Double> mc = myClassFactory(myClassCons, 100.1);
        // Использовать только что созданный экземпляр MyClass.
        System.out.println("val в mc равно " + mc.getVal());
        // Теперь создать другой класс с применением myClassFactory().
        MyFunc6<MyClass5, String> myClassCons2 = MyClass5::new;
        // Создать экземпляр MyClass2, используя фабричный метод.
        MyClass5 mc2 = myClassFactory(myClassCons2, "Lambda");
        // Использовать только что созданный экземпляр MyClass2.
        System.out.println("str в mc2 равно " + mc2.getVal());
    }
}
