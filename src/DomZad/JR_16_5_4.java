package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Гласные и согласные буквы
*/

public class JR_16_5_4 {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        for (char character : string.toCharArray()) {
            if (isVowel(character)) {
                builder1.append(character).append(" ");
            } else if (character != ' ') {
                builder2.append(character).append(" ");
            }
        }

        System.out.println(builder1);
        System.out.println(builder2);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}

