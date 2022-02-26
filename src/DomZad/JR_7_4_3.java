package DomZad;

/*
Минимум четырех чисел
*/
public class JR_7_4_3 {

    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код

        if (c < min(a, b) & c < d) return c;
        else if (d < min(a, b) & d < c) return d;
        else return min(a, b);
    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a < b) return a;
        else return b;
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}


