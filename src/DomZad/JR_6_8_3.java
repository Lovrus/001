package DomZad;

import java.util.Arrays;

/*
 массива
*/
public class JR_6_8_3 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //напишите тут ваш код
        Arrays.sort(array);
        String str = Arrays.toString(array);
        System.out.println(Arrays.toString(array));
    }
}


