package DomZad;

public class JR_4_5_4 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        while (a <= 10) {
            a++;
            while (b <= 10) {
                System.out.print("S");
                b++;
            }
            b = 1;
            System.out.println();
        }
    }
}

