package DomZad;
/*
Статики и исключения
*/

public class JR_21_9_4 {
    public static int A = 0;

    static {
        if (true) throw new RuntimeException("");
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}

