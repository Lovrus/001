package DomZad;
/*
Исключение при работе со строками
*/

public class JR_15_6_2 {
    public static void main(String[] args) {
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
