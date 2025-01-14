package Java_H_Schildt.chapter_2_31;
// Использование метода find() для поиска нескольких вхождений.

import java.util.regex.*;

public class RegExprЗ {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("тест");
        Matcher mat = pat.matcher("тест 1 2 3 тест");
        while (mat.find()) {
            System.out.println("тест найдено по индексу: " +
                    mat.start());
        }
    }
}
