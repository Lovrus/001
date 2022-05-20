package DomZad;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/*
Самое большое число
*/

public class JR_13_2_3 {

    private static ArrayList<Integer> integers = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            integers.add(Integer.parseInt(reader.readLine()));
        }

        Integer[] array = integers.toArray(new Integer[0]);
        Arrays.sort(array);

        System.out.println(array[array.length - 1]);
    }
}
