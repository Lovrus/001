package Java_H_Schildt.chapter_1_12;
// Показать все аннотации для класса и метода

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno21 {
    String str();

    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового класса")
@MyAnno21(str = "Meta21", val = 99)
public class Meta21 {
    @What(description = "Аннотация тестового метода")
    @MyAnno21(str = "Testing", val = 100)
    public static void myMeth21() {
        Meta21 ob = new Meta21();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta21
            System.out.println("Все аннотации для класса Meta21:");
            for (Annotation a : annos)
                System.out.println(a);

            System.out.println();

            // вывести все аннотации для метода myMeth21()
            Method m = ob.getClass().getMethod("myMeth21");
            annos = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth():");
            for (Annotation a : annos)
                System.out.println(a);
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth21();
    }
}
