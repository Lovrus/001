package chapter_2_19;

/* Преобразование целого числа в двоичную,
шестнадцатеричную и восьмеричную строку.
 */
public class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println(num + " в двоичной форме: " +
                Integer.toBinaryString(num));
        System.out.println(num + " в возьмиричной форме: " +
                Integer.toOctalString(num));
        System.out.println(num + " в шестрадцатеричной форме: " +
                Integer.toHexString(num));
    }
}
