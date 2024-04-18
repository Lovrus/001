package chapter_2_21;
// Демонстрация работы нескольких методов Optional<T>.

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");
        if (noVal.isPresent()) System.out.println("Это не отобразится");
        else System.out.println("noval не имеет значения");
        if (hasVal.isPresent()) System.out.println("Строка в hasVal: " +
                hasVal.get());
        String defStr = noVal.orElse("Стандартная строка");
        System.out.println(defStr);
    }
}
