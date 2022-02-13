package DomZad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JR_6_3_2 {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] age = new int[10];
        for (int i = 0; i < 10; i++) {
            String s = null;
            try {
                s = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            age[i] = Integer.parseInt(s);
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(age[i]);
        }
    }
}
