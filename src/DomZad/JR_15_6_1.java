package DomZad;
/*
Исключение при работе с числами
*/

public class JR_15_6_1 {
    public static void main(String[] args) {
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
