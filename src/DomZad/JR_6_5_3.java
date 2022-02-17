package DomZad;

import java.util.Scanner;

/*
Шахматная доска
*/

public class JR_6_5_3 {
    public static char[][] array;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        array = new char[a][a];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + j) % 2 == 0 ? '#' : ' ';
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}




