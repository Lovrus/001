package chapter_2_31;
// Использование группового символа и квартификатора.

import java.util.regex.*;

public class RegExpr5 {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");
        while (mat.find())
            System.out.println("Совпадение: " + mat.group());
    }
}
