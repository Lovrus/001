package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JR_2_7 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println("Через " + nAge + " лет" + name + " отметит юбилей.");

    }
}