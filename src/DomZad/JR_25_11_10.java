package DomZad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Поиск данных внутри файла
*/

public class JR_25_11_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while ((str = bufferedFileReader.readLine()) != null) {
                if (str.startsWith(args[0] + " ")) {
                    System.out.println(str);
                    break;
                }
            }
        }
    }
}
