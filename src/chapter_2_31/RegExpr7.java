package chapter_2_31;
// Использование класса символов.

import java.util.regex.*;

public class RegExpr7 {
    public static void main(String[] args) {
// Сопоставить со словами в нижнем регистре.
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");
        while (mat.find())
            System.out.println("Соспадение: " + mat.group());
    }
}
