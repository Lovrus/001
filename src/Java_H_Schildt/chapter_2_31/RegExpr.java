package Java_H_Schildt.chapter_2_31;
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
        System.out.println("Проверка на совпадение Java с Java");
        if (found) System.out.println("Совпадает");
        else System.out.println("не совпадает");
        System.out.println();
        System.out.println("Проверка на совпадение Java с Java SE.");
        mat = pat.matcher("Java SE"); // Создать новый объект Matcher
        found = mat.matches(); // Проверить на совпадение
        if (found) System.out.println("Совпадает");
        else System.out.println("Не совпадает");
    }
}
