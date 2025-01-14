package Java_H_Schildt.chapter_1_13;

public class MyClass_2 {
    int a;
    int b;

    // иницилизировать поля а и b  по отдельности
    MyClass_2(int i, int j) {
        a = i;
        b = j;
    }

    // иницилизировать поля а и b одним и тем же значением
    MyClass_2(int i) {
        this(i, i); // по этой ссылке вызывается конструктор MyClass(i,i)
    }

    // присвоить полям а и b нулевое значение по умолчанию
    MyClass_2() {
        this(0); // а по этой ссылке вызывается коструктор MyClass(0)
    }
}
