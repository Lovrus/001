package DomZad;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Подсчет запятых
*/

public class JR_25_5_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int commaCount = 0;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                if (fileInputStream.read() == 44) commaCount++;
            }
        }
        System.out.println(commaCount);
    }
}
