package DomZad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Осваивание статического блока
*/

public class JR_21_12_1 {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String key = reader.readLine();
            if ("plane".equals(key)) {
                key = reader.readLine();
                result = new Plane(Integer.parseInt(key));
            } else if ("helicopter".equals(key)) {
                result = new Helicopter();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
