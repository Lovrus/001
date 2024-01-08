package chapter_1_7;

// Применить автоматиеское преобразование типов к перегрузке
public class OverloadDemo_2 {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемы метод, проверяющие наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b :" + a + " " + b);
    }

    // Перегружаемый метод, проверяющий наличие
    // параметра типа double
    void test(double a) {
        System.out.println("Внутреннее проеобразование при вызове "
                + " test (double) a: " + a);
    }
}

class Overload_1 {
    public static void main(String[] args) {
        OverloadDemo_2 ob = new OverloadDemo_2();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i); // здесь вызывается вариант
        // метода test(double)
        ob.test(123.2); // и здесь вызывается вариант
        // метода test(double)
    }
}
