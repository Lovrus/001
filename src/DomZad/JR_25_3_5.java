package DomZad;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/*
Сортировка байт
*/

public class JR_25_3_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        Set<Integer> bytes = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                bytes.add(fileInputStream.read());
            }
        }
        for (Integer aByte : bytes) {
            System.out.print(aByte + " ");
        }
    }
}
