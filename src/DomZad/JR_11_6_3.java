package DomZad;

import java.util.Arrays;

/*
Забытая инициализация
*/

public class JR_11_6_3 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}

