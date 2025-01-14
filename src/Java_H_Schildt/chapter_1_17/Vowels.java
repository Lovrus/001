package Java_H_Schildt.chapter_1_17;

// Использование выражения switch для выяснения, является ли символ
// гласной буквой в английском языке. Обратите внимание на применение
// блока в качестве цели оператора case со стрелкой для Y.
public class Vowels {
    public static void main(String[] args) {
        // Если буква Y длолжна считаться главной, тогда эту переменную
        // Необходимо установить в true.
        boolean yIsVowel = true;
        char ch = 'Y';
        boolean isVowel = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            case 'y', 'Y' -> {
                if (yIsVowel) yield true;
                else yield false;
            }
            default -> false;
        };
        if (isVowel) System.out.println(ch + " является гласной буквой.");
    }
}
