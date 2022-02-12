package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_4_11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if ((a >= b) & (c <= b)) {
            System.out.println(b);
        } else if ((c >= b) & (a <= b)) {
            System.out.println(b);
        } else if ((b >= a) & (c <= a)) {
            System.out.println(a);
        } else if ((c >= a) & (b <= a)) {
            System.out.println(a);
        } else if ((b >= c) & (a <= c)) {
            System.out.println(c);
        } else if ((a >= c) & (b <= c)) {
            System.out.println(c);
        } else System.out.println(b);
    }
}
    