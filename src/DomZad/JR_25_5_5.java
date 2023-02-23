package DomZad;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
DownloadException
*/

public class JR_25_5_5 {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();

            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                if (fileInputStream.available() < 1000) throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
