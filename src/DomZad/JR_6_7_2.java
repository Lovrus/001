package DomZad;
import java.util.Arrays;

/*
Выводим двумерные массивы
*/
public class JR_6_7_2 {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        //напишите тут ваш код
        String a = Arrays.deepToString(strings);
        System.out.println(a);
        String b = Arrays.deepToString(ints);
        System.out.println(b);
    }
}

