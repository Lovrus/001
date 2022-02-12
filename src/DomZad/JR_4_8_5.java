package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_4_8_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        for (int a = 1; a <= 10; a++) {
            System.out.println(name + " любит меня.");
        }
    }
}
