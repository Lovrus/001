package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_6_3_1 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] Strok = new String[10];
        for (int i = 0; i < 8; i++) {
            Strok[i]  = reader.readLine();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println(Strok[i]);
        }
    }
}

