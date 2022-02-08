package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_9_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        if (a > 0 && b > 0)
            System.out.println(1);
        if (a < 0 && b > 0)
            System.out.println(2);
        if (a < 0 && b < 0)
            System.out.println(3);
        if (a > 0 && b < 0)
            System.out.println(4);
    }
}
