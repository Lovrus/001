package Java_H_Schildt.chapter_1_8;

// Переопределение метода
public class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // вывести содержимое переменной к с помощью метода,
    // переопределяющего метода show() из класса А
    void show() {
        System.out.println("к: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B5 subOb = new B5(1, 2, 3);
        subOb.show(); // здесь вызывается метод show()
        // из класса В
    }
}
