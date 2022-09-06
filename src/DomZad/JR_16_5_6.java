package DomZad;
/*
Расставь модификаторы static
*/

public class JR_16_5_6 {
    public static int E = 5;
    public static int B = 2 * E;
    public int C = E * B;
    public static int F = E * B;

    public static void main(String[] args) {
        JR_16_5_6 solution = new JR_16_5_6();
        JR_16_5_6.E = 5;

        JR_16_5_6.F = 5;
    }

    public int getA() {
        return E;
    }

}
