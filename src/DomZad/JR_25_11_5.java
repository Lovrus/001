package DomZad;

import java.io.FileReader;
import java.io.IOException;

/*
Пробелы
*/

public class JR_25_11_5 {
    public static void main(String[] args) throws IOException {
        int total = 0;
        int spaces = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readedChar = fileReader.read();
                total++;
                if (readedChar == (int) ' ') spaces++;
            }
        }
        if (total != 0) {
            double result = (double) spaces / total * 100;
            System.out.printf("%.2f", result);
        }
    }
}
