package chapter_1_12;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Маркерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class Marker {
    // анотировать метод с помощью маркера
    // Обратите внимание на обязательность скобок ()
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            // определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println(
                        "Маркерная аннотация myMarker присутствует.");
        } catch (NoSuchMethodException exc) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
