package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_7_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        if (number > 0) {
            number = number * 2;
        } else if (number < 0) {
            number = number + 1;
        } else if (number == 0) {
            number = 0;
        }
        System.out.println(number);

    }
}
