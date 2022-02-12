package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_4_8_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());
        for (int m1 = 1; m1 <= m; m1++) {
            for (int n1 = 1; n1 <= n; n1++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
