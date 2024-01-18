package chapter_1_8;

// Простой пример абстракции
abstract class A9 {
   abstract void callme9();

    // абстрактные классы все же могут
    //содержать конкретные методы
    void callmetoo() {
        System.out.println("Это конкретный метод.");
    }
}

class B9 extends A9 {
    void callme9() {
        System.out.println(
                "Реализация метода callme() в классе В.");
    }
}

class AbstraktDemo {
    public static void main(String[] args) {
        B9 b = new B9();
        b.callme9();
        b.callmetoo();
    }
}
