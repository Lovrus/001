package DomZad;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удвой слова
*/

public class JR_13_5_5
{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        ArrayList<String> result = doubleValues(strings);

        for (String string : result) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList<>();
        for (String string : list) {
            result.add(string);
            result.add(string);
        }
        return result;
    }
}

