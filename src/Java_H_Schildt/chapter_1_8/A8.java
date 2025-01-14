package Java_H_Schildt.chapter_1_8;

// Динамическая диспетчеризация методов
public class A8 {
    void callme() {
        System.out.println("В методе callme()  из класа А");
    }
}

class B8 extends A8 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса В");
    }
}

class C8 extends A8 {
    // переопределить метод callme()
    void callme() {
        System.out.println("В методе callme() из класса С");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A8 a = new A8(); // объект класса А
        B8 b = new B8(); // объект класса В
        C8 c = new C8(); // объект класса С

        A8 r; // получить ссылку на объект типа А

        r = a; // переменная r  ссылается на объект типа А
        r.callme(); // вызвать вариант метода callme(),
        // определенный в класе А
        r = b; // переменная r  ссылается на объект типа В
        r.callme(); // вызвать вариант метода callme(),
        // определенный в классе В
        r = c;// переменная r  ссылается на объект типа С
        r.callme(); // вызвать вариант метода callme(),
        // определенный в классе С
    }
}
