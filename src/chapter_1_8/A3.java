package chapter_1_8;

// Использовать ключевое слово super с целью
// предотвратить сокрытие имен
public class A3 {
    int i;
}

// создать  подкласс путем расширения класса A
class B3 extends A3 {
    int i; // это член скрывает член i из класса A

    B3(int a, int b) {
        super.i = a; // член i из класса A
        i = b; // член i из клсса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B3 subOb = new B3(1, 2);

        subOb.show();
    }
}
