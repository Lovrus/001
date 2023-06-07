package DomZad;
/*
Найти подстроку
*/

public class JR_29_05_02 {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] splitWithSpaces = string.split(" ");

        if (splitWithSpaces.length < 5) throw new TooShortStringException();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 5; i++) {
            stringBuilder.append(splitWithSpaces[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
