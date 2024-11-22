package chapter_2_31;
// Простая демонстрация работы сопоставления с шаблоном.

import java.util.regex.*;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;
        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches(); // проверить на совпадение

    }
}
