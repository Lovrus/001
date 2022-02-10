package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_11_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(reader.readLine());
        int a2 = Integer.parseInt(reader.readLine());
        int a3 = Integer.parseInt(reader.readLine());
        int b1 = 0;
        if (a1 > 0) b1 = b1 + 1;
        if (a2 > 0) b1 = b1 + 1;
        if (a3 > 0) b1 = b1 + 1;
        System.out.println(b1);
        {
        }
    }
}
