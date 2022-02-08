package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_3_9_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name2 = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
