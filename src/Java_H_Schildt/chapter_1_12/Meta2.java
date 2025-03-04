package Java_H_Schildt.chapter_1_12;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();

    int val();
}

public class Meta2 {

    // У меода myMeth() теперь имеются два аргумента
    @MyAnno2(str = "Два параметра", val = 19)
    public static void myMeth(String str, int i) {
        Meta2 ob = new Meta2();

        try {
            Class<?> c = ob.getClass();

            // Здесь указываются типы параметров
            Method m = c.getMethod("myMeth", String.class,
                    int.class);
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 10);
    }
}
