package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_11_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter1 = 0;
        int counter2 = 0;
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        if (number1 > 0) {
            counter1++;
        } else if (number1 < 0) {
            counter2++;
        } if (number2 > 0) {
            counter1++;
        }else if (number2 < 0) {
            counter2++;
        } if (number3 > 0) {
            counter1++;
        } else if (number3 < 0) {
            counter2++;
        }
        System.out.println("количество отрицательных чисел: " + counter2);
        System.out.println("количество положительных чисел: " + counter1);
    }
}

