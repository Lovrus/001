package DomZad;
import java.util.Scanner;

/*
Возврат к истокам
*/

public class JR_16_3_2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            System.out.println(line.toUpperCase());
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
