package DomZad;

import java.io.*;

/*
Разделение файла
*/

public class JR_25_5_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile1 = reader.readLine();
        String outputFile2 = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream1 = new FileOutputStream(outputFile1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(outputFile2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            int numberOfByte = 0;
            while (fileInputStream.available() > 0) {
                if (numberOfByte < halfOfFile) {
                    fileOutputStream1.write(fileInputStream.read());
                    numberOfByte++;
                } else fileOutputStream2.write(fileInputStream.read());
            }
        }
    }
}
