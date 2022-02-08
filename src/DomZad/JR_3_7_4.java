package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_7_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        if (b == 1)
            System.out.println("понедельник");
        if (b == 2)
            System.out.println("вторник");
        if (b == 3)
            System.out.println("среда");
        if (b == 4)
            System.out.println("четверг");
        if (b == 5)
            System.out.println("пятница");
        if (b == 6)
            System.out.println("суббота");
        if (b == 7)
            System.out.println("воскресенье");
        if (b <1)
            System.out.println("такого дня недели не существует");
        if (b > 7)
            System.out.println("такого дня неели не существует");
    }
}