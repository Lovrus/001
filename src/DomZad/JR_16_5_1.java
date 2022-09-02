package DomZad;
/*
Деление на ноль
*/

public class JR_16_5_1 {

    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int x = 5 / 0;
        System.out.println(x);
    }
}
