package DomZad;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Это конец
*/

public class JR_13_8_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string.equals("end")) {
                break;
            }
            strings.add(string);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
