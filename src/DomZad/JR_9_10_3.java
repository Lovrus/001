package DomZad;
/*
Палиндром слова
*/
public class JR_9_10_3 {

    public static void main(String[] args) {
        String word = "Ротор";
        String answer = isPalindrome(word) ? "Да" : "Нет";
        System.out.println("Слово \"" + word + "\" палиндром? " + answer);
    }

    public static boolean isPalindrome(String word) {
        StringBuilder builder = new StringBuilder(word);
        builder.reverse();
        return word.equalsIgnoreCase(builder.toString());
    }
}

