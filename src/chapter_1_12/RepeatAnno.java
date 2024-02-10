package chapter_1_12;

// Продемонстрировать применение повторяющейся аннотации

import java.lang.annotation.*;
import java.lang.reflect.*;

// сделать аннотацию MyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyyAnno {
    String str() default "Тестирование";

    int val() default 9000;
}

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyyAnno[] value();
}

public class RepeatAnno {

    // повторить аннотацию MyAnno в методе myMeth()
    @MyyAnno(str = "Первая аннотация", val = -1)
    @MyyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            // получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);
            // вывести повторяющиеся аннотации MyAnno
            Annotation anno = m.getAnnotation(
                    MyRepeatedAnnos.class);
            System.out.println(anno);

        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
