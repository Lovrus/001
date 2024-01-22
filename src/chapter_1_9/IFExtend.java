package chapter_1_9;

// Один интерфейс может расширять другой
interface A1 {
    void meth1();

    void meth2();
}

// теперь интерфейс В влючает в себя метоы meth1()
// и meth2() и добавляет метод meth3()
interface B1 extends A1 {
    void meth3();
}

//  Этот класс должен реализовать все методы
// из интерфейсов А и В
class MyClass implements B1 {
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
