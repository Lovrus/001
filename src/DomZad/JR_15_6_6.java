package DomZad;

/*
Исключение при работе с числами
*/

public class JR_15_6_6 {

    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
