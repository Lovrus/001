package chapter_1_12;
// Продемонстрировать применение нескольких
// типовых аннотаций

import java.lang.annotation.*;
import java.lang.reflect.*;

// Аннотация-маркер, которую можно применить к типу данных
@Target(ElementType.TYPE_USE)
@interface TypeAnno {
}

// Еще одна аннотация-маркер, которую можно
// применить к типу данных
@Target(ElementType.TYPE_USE)
@interface NotZeroLen {
}

// И еще одна аннотация-маркр, которую можно
// применить к типу данных
@Target(ElementType.TYPE_USE)
@interface Unique {
}

// Пааметризированная аннотация, которую можно
// пименить к типу данных
@Target(ElementType.TYPE_USE)
@interface MaxLen {
    int value();
}

// Аннотация, котору можно применить к параметру типа
@Target(ElementType.TYPE_PARAMETER)
@interface What1 {
    String description();
}

// Аннотация, которую можно применить в объявлени поля
@Target(ElementType.FIELD)
@interface EmptyOK {
}

// Аннотация, котоуюможно применить в объявлении метода
@Target(ElementType.METHOD)
@interface Recommendet {
}

// применить аннотацию в параметре типа
class TypeAnnoDemo<@What1(
        description = "Данные обобщенного типа") T> {
    // применить типовую аннотацию в конструкторе
    public @Unique TypeAnnoDemo() {
    }

    // аннотировать типа (в данном случае - String), но не поле
    @TypeAnno String str;

    // аннотировать теcт поля
    @EmptyOK
    String test;

    // применить типовую аннотацию для аннотирования
    // ссылки this на объект (получатель)
    public int f(@TypeAnno TypeAnnoDemo<T>this, int x) {
        return 10;
    }

    // аннотировать возвращаемый тип
    public @TypeAnno Integer f2(int j, int k) {
        return j + k;
    }

    // аннотировать объявление метода
    public @Recommendet
    Integer f3(String str) {
        return str.length() / 2;
    }

    // применить типовую аннотацию в оператое throws
    public void f4() throws @TypeAnno NullPointerException {
        // ...
    }

    // аннотировать тип элемента массива
    @TypeAnno Integer[] vec;

    public static void myMeth(int i) {

        // применить типовую аннотацию в аргументе типа
        TypeAnnoDemo<@TypeAnno Integer> ob =
                new TypeAnnoDemo<@TypeAnno Integer>();

        // применить типовую аннотацию в операторе new
        @Unique TypeAnnoDemo<Integer> ob2 =
                new @Unique TypeAnnoDemo<Integer>();

        Object x = new Integer(10);
        Integer y;

        // применить типовую аннотацию в приведенни типов
        y = (@TypeAnno Integer) x;
    }

    public static void main(String arsg[]) {
        myMeth(10);
    }

    // применить типовую аннотацию в выражении наследования
    class SomeClass extends @TypeAnno TypeAnnoDemo<Boolean> {
    }
}
