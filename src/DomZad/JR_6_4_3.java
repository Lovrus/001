package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_6_4_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tekst = new String[10];
        int[] number = new int[10];

        for (int i = 0; i < tekst.length; i++) {
            tekst[i] = reader.readLine();
        }
        for (int i = 0; i < tekst.length; i++) {
            number[i] = tekst[i].length();
            System.out.println(number[i]);
        }
    }
}
