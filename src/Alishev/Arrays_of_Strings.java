package Alishev;

// Урок 12. Цикл for each, Массивы строк.
public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings2 = new String[3];
        strings2[0] = "Привет";
        strings2[1] = "Пока";
        strings2[2] = "Джава";

        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }
        System.out.println();

        for (String string : strings2) {
            System.out.println(string);
        }
        int[] numbers1 = {1, 2, 3};
        int sum = 0;
        for (int x : numbers1) {
            sum = sum + x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = "qwert";
        System.out.println(s);
    }
}
