package DomZad;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Реверс файла
*/

public class JR_25_5_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                inputBytes.add(fileInputStream.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes) {
                fileOutputStream.write(aByte);
            }
        }
    }
}
