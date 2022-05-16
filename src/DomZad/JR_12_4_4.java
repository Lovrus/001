package DomZad;
/*
Задача №1 на преобразование целых типов
*/

public class JR_12_4_4 {
    public static void main(String[] args) {
        int a = 0;
        int b = a + 46;
        byte c = (byte) (a * b);
        double f = 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }
}

