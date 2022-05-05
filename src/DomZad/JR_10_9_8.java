package DomZad;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
IPv6
*/
public class JR_10_9_8 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map("2001:db8:11a3:9d7:1f34:8a2e:7a0:765d")));
    }

    public static String[] map(String ipv6) {
        StringTokenizer tokenizer = new StringTokenizer(ipv6, ":");
        String[] tokens = new String[tokenizer.countTokens()];
        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = tokenizer.nextToken();
        }
        return tokens;
    }
}

