package Java_H_Schildt.chapter_1_7;

// Продемонстрировать перегрузку методов
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие
    // одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие
    // двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // Перегружаемый метод, проверящий наличие
    // параметра типа double
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        double result;

        // вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println(
                "Результат вызова ob.test(123.25): " + result);
    }
}
