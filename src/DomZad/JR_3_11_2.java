package DomZad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JR_3_11_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        if (b % 2 == 0) {
            if (b >= 1 & b <= 9) {
                System.out.println("четное однозначное число");
            } else if (b >= 10 & b <= 99) {
                System.out.println("четное двузначное число");
            } else if (b >= 100 & b <= 999) {
                System.out.println("четное трехзначное число");
            }
        }
        else if (b % 2 == 1) {
            if (b >= 1 & b <= 9) {
                System.out.println("нечетное однозначное число");
            } else if (b >= 10 & b <= 99) {
                System.out.println("нечетное двузначное число");
            } else if (b >= 100 & b <= 999) {
                System.out.println("нечетное трехзначное число");
            }
        }
    }
}

