package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_9_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int z = Integer.parseInt(reader.readLine());
        int x = Integer.parseInt(reader.readLine());
        if (z > x)
            System.out.println(x);
        if (z < x)
            System.out.println(z);
        if (z == x)
            System.out.println(x);
    }
}
