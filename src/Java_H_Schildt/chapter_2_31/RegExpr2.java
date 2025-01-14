package Java_H_Schildt.chapter_2_31;
// Использование метода find() для поиска подпоследовательности.

import java.util.regex.*;

public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java SE");
        System.out.println("Поиск Java в Java SE");
        if (mat.find()) System.out.println("Подпоследовательность найдена");
        else System.out.println("Совпадений не обнаружено");
    }
}
