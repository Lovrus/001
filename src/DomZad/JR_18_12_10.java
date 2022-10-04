package DomZad;
/*
Попадание в десятку
*/

public class JR_18_12_10 {
    public static void main(String[] args) {
        Integer i = 5;
        int x = transformValue(i);

        System.out.println(x);
    }

    public static int transformValue(int i) {
        return i * i;
    }

    public static int transformValue(Integer i) {
        return i * 2;
    }
}

