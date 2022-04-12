package chapter_1_12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление типа аннотации, включая значения
// ее членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str() default "Тестирование";

    int val() default 9000;
}

public class Meta3 {

    // аннотировать метод. используя значния по умолчанию
    @MyAnno3()
    public static void myMeth3() {
        Meta3 ob = new Meta3();

        // получить аннотацию для данного метода
        // и вывести значения ее членов

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth3");

            MyAnno3 anno3 = m.getAnnotation(MyAnno3.class);

            System.out.println(anno3.str() + " " + anno3.val());
        } catch (NoSuchMethodException exp) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth3();
    }
}
