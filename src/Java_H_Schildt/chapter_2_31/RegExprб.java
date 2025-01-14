package Java_H_Schildt.chapter_2_31;
// Использование квантификатора ленивого поведения.

import java.util.regex.*;

public class RegExprб {
    public static void main(String[] args) {
        // Задать ленивое поведение сопоставления.
        Pattern pat = Pattern.compile("e.+?d");
        Matcher mat = pat.matcher("extend cup end table");
        while (mat.find())
            System.out.println("Совпадение: " + mat.group());
    }
}
