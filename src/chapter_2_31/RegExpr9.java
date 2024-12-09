package chapter_2_31;
// Использование метода split().

import java.util.regex.*;

public class RegExpr9 {
    public static void main(String[] args) {
        // Сопоставить со словами в нижнем регистре.
        Pattern pat = Pattern.compile("[ ,.!]");
        String[] strs = pat.split("one two,alpha9 12!done.");
        for (int i = 0; i < strs.length; i++)
            System.out.println("Следующая лексема: " + strs[i]);
    }
}
