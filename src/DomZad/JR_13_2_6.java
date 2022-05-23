package DomZad;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удали последнюю строку и вставь её в начало
*/

public class JR_13_2_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        for (int i = 0; i < 13; i++) {
            String string = strings.remove(4);
            strings.add(0, string);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
