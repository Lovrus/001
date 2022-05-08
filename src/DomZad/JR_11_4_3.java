package DomZad;
/*
Класс StringHelper
*/

public class JR_11_4_3 {
    public static String multiply(String text) {
        return multiply(text, 5);
    }

    public static String multiply(String text, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            stringBuilder.append(text);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {

    }
}
