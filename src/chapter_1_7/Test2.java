package chapter_1_7;

// аргументы примитивных типов передаются по значению
public class Test2 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();

        int a = 15, b = 20;

        System.out.println(" а и b до вызова: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println(" а и b после вызова: " +
                a + " " + b);
    }
}