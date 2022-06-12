package DomZad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Максимальное и минимальное числа в массиве
*/

public class JR_13_8_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = numbers[0];
        int minimum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        System.out.print(maximum + " " + minimum);
    }
}
