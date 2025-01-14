package Java_H_Schildt.chapter_2_31;
// Использование метода replaceAll().

import java.util.regex.*;

public class RegExprB {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";
        Pattern pat = Pattern.compile("Jon.*? ");
        Matcher mat = pat.matcher(str);
        System.out.println("Исходная последовательность: " + str);
        str = mat.replaceAll("Eric ");
        System.out.println("Модифицированная последовательность: " + str);
    }
}
