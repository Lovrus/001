package DomZad;
/*
Из маленькой корзинки в большую
*/

public class JR_12_4_1 {

    public static void main(String[] args) {
        System.out.println(getSquare(7)); // 49.0
        System.out.println(getSquare(100_000_001)); // 1.00000002E16
        System.out.println(getSquare(9_000_000_000_000_000_001L)); // 8.1E37
    }

    public static double getSquare(long number) {
        return (double) number * number;
    }
}

