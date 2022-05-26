package DomZad;

import java.util.ArrayList;

/*
Р или Л
*/

public class JR_13_5_3 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        String r = "р";
        String l = "л";

        ArrayList<String> result = new ArrayList<>();
        for (String string : strings) {
            boolean isR = string.contains(r);
            boolean isL = string.contains(l);

            if (isR && !isL) {
                continue;
            }

            if (!isR && isL) {
                result.add(string);
            }

            result.add(string);
        }
        return result;
    }
}
