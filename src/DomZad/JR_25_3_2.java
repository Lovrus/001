package DomZad;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class JR_25_3_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int minByte = 255;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                int currByte = fileInputStream.read();
                if (currByte < minByte) minByte = currByte;
            }
        }
        System.out.println(minByte);
    }
}
