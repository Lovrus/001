package chapter_1_12;
import java.lang.annotation.*;
import java.lang.reflect.*;

// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface Myanno {
    String str();
    int val();
}

public class Meta {
    // аннотировать метод
    @Myanno(str = "Пример аннотации", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // получить аннотацию из метода
        // и вывести значения ее членов
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс
            Class<?> c = ob.getClass();

            // затем получить объект типа
        }

    }

}
