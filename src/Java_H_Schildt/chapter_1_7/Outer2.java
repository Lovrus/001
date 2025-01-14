package Java_H_Schildt.chapter_1_7;

// Эта программа не подлежит компиляции
public class Outer2 {
    int outer_x = 100;

    void test() {
        Inner1 inner = new Inner1();
        inner.display();
    }

    // это внутренний класс
    class Inner1 {
        int y = 10; // у - локальная переменная класса Inner

        void display() {
            System.out.println("Вывод: outer_x = " + outer_x);
        }
    }

    void showy() {
        // System.out.println(y); ошибка, здесь переменная
        // у недоступна!
    }
}

class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
