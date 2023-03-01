package DomZad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
Шифровка
*/

public class JR_25_11_1 {
    public static void main(String[] args) throws IOException {
        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            if (mode.equals("-e")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 32);
                }
            } else {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 32);
                }
            }
        }
    }
}
