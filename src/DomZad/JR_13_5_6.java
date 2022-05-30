package DomZad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Сортировка списка
*/

public class JR_13_5_6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String currentString = strings.get(0);

        for (int i = 1; i < 10; i++) {
            if (strings.get(i).length() >= currentString.length()) {
                currentString = strings.get(i);
            } else {
                System.out.println(i);
                break;
            }
        }
    }
}
