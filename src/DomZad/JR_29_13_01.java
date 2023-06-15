package DomZad;

import java.util.StringTokenizer;

/*
StringTokenizer
*/

public class JR_29_13_01 {
    public static void main(String[] args) {
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            result[i++] = stringTokenizer.nextToken();
        }
        return result;
    }
}
