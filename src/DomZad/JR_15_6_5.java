package DomZad;

import java.util.HashMap;

/*
Исключение при работе с коллекциями Map
*/

public class JR_15_6_5 {

    public static void main(String[] args) {
        try {
            HashMap<String, String> map = new HashMap<>(null);
            System.out.println(map);
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
