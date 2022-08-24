package DomZad;
/*
Исключение при работе с массивами
*/

public class JR_15_6_3 {

    public static void main(String[] args) {
        try {
            int[] array = new int[2];
            array[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}

