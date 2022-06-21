package chapter_1_13;

public class MyClass {
    int a;
    int b;

    // иницилизировать поля a и b по отдельности
    MyClass(int i, int j) {
        a = i;
        b = j;
    }

    // иницилизировать поля a и b одним и тем же значением
    MyClass(int i) {
        a = i;
        b = i;
    }

    // присвоить полям a и b нулевое значение по умолчанию
    MyClass() {
        a = 0;
        b = 0;
    }
}
