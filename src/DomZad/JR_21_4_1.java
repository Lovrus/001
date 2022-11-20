package DomZad;
/*
Что-то лишнее
*/

public class JR_21_4_1 {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print(1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }
}
