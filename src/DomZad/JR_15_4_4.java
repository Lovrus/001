package DomZad;

import java.io.FileNotFoundException;

import static DomZad.JR_15_4_1.method1;

public class JR_15_4_4 {
    public static void method4() {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException has been caught.");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException has been caught.");
        }
    }
}
