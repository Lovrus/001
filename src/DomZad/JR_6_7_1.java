package DomZad;
import java.util.Arrays;

/*
Выводим массивы
*/

public class JR_6_7_1 {

        public static String[] strings = new String[]{"I", "love", "Java"};
        public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        public static void main(String[] args) {
            //напишите тут ваш код
            String a = Arrays.toString(strings);
            System.out.println(a);
            String b = Arrays.toString(ints);
            System.out.println(b);

        }
    }

