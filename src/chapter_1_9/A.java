package chapter_1_9;

// Пример вложенного интерфейса
// Этот класс содерит интерфейс как свой член
public class A {
    // это вложенный интерфейс
    public interface NestedIF {
        boolean isNotNegative(int x);
    }
}

// Класс В реализует влженный интерфейс
class B implements A.NestedIF {
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}

class NestedIFDDemo {
    public static void main(String[] args) {

        // использовать ссылку на вложенный интефейс
        A.NestedIF nif = new B();

        if (nif.isNotNegative(10))
            System.out.println("Число 10 неотрицатеьное");
        if (nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
