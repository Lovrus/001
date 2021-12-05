package chapter_1_8;

// Методы с отличающимися сигнатурами счиаются
// перегружаемыми, а не переопределяемыми
public class A7 {
    int i, j;

    A7(int a, int b) {
        i = a;
        j = b;
    }

    // вывести содержимое переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса А
class B7 extends A7 {
    int k;

    B7(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // перегрузить метод super()
    void show(String msq) {
        System.out.println(msq + k);
    }
}

class Override7 {
    public static void main(String[] args) {
        B7 subOb = new B7(1, 2, 3);

        subOb.show("Это к: "); // вызвать метод show()
        // из класса В
        subOb.show(); // вызвать метод show() и класса А
    }
}
