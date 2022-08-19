package DomZad;

import java.io.FileNotFoundException;

import static DomZad.JR_15_4_1.method1;

public class JR_15_4_3 {
    public static void method3() throws ClassNotFoundException {
        try {
            method1();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException has been caught.");
        }
    }

}
