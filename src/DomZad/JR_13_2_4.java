package DomZad;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая короткая строка
*/

public class JR_13_2_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int minStringLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() < minStringLength) {
                minStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == minStringLength) {
                System.out.println(string);
            }
        }
    }
}
