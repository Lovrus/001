package DomZad;
/*
Двоичная кодировка
*/
public class JR_10_9_7 {

    public static void main(String[] args) {
        String string = "JavaRush";
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            print(charArray[i]);
        }
    }

    private static void print(int number) {
        String result = String.format("Номер символа %s в таблице Unicode - %d, а в двоичной системе - %s", (char) number, number, toBinary(number));
        System.out.println(result);
    }

    public static String toBinary(int number) {
        String result = "";
        while (number != 0) {
            result = number % 2 + result;
            number /= 2;
        }
        return result;
    }
}
