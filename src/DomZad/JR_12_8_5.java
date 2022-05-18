package DomZad;
/*
Расставьте минимум static-ов
*/

public class JR_12_8_5 {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;

    public static void main(String[] args) {
        JR_12_8_5 solution = new JR_12_8_5();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        JR_12_8_5.D = 5 * D * C;

        JR_12_8_5.D = 5;
    }

    public int getA() {
        return A;
    }

}
