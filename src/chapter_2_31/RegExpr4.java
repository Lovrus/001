package chapter_2_31;
// Использование квантификатора.

import java.util.regex.*;

public class RegExpr4 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");
        while (mat.find()) {
            System.out.println("Совпадение: " +
                    mat.group());
        }
    }
}
