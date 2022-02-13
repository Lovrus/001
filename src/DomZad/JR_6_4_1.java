package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class JR_6_4_1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[20];

        for (int i = 0; i < 20; i++) {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            number[i] = Integer.parseInt(s);
        }
        int[] number2 = new int[10];
        int[] numbers3 = new int[10];

        int a = 0;
        while (a < 10) {
            number2[a] = number[a];
            a++;
        }
        for (int b = 0; b < 10; b++) {
            numbers3[b] = number[b + 10];
            System.out.println(numbers3[b]);
        }
    }
}