package DomZad;

import java.util.Arrays;

/*
 массив
*/
public class JR_6_8_2 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        result[0] = Arrays.copyOfRange(array, 0, firstPart);
        result[1] = Arrays.copyOfRange(array, firstPart, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}



1-1
2-ошибка
3-4
4-4
5-3
6-3
7-4
8- -3
9-1
10- -1

