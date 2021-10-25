package chapter_1_7;

// Аргументы примитивных типов передаются по значению
public class Test4 {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue1 {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        int a = 15, b = 20;

        System.out.println(" a и b до вызова: " +
                a + " " + b);

        ob.meth(a, b);

        System.out.println(" a и b после вызова: " +
                a + " " + b);
    }
}