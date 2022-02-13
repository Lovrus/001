package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_4_12_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        while (true) {
            int number1 = Integer.parseInt(reader.readLine());
            number = number + number1;
            if (number1 == -1) {
                System.out.println(number);
                break;
            }
        }
    }
}

