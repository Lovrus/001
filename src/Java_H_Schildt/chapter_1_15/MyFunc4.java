package Java_H_Schildt.chapter_1_15;

// Демонстрация использования ссылки на конструктор.
// MyFunc - функкциональный интерфейс, метод которого
// возвращает ссылку на конструктор MyClass.
public interface MyFunc4 {
    MyClass2 func(int n);
}

class MyClass2 {
    private final int val;

    // Конструктор, принимающий аргумент.
    MyClass2(int v) {
        val = v;
    }

    // Стандартный конструктор.
    MyClass2() {
        val = 0;
    }

    //...
    int getVal() {
        return val;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        // Создать ссылку на конструктор MyClass2.
        // Посколько метод func() в MyFunc принимает аргумент, new ссылается
        // на параметризованный конструктор MyClass, а не на стандартный.
        MyFunc4 myClassCons = MyClass2::new;
        // Создать экземпляр MyClass2 через эту ссылку на конструктор.
        MyClass2 mc = myClassCons.func(100);
        // Использовать только что созданный экземпляр MyClass2.
        System.out.println("val в mc равно " + mc.getVal());
    }
}
