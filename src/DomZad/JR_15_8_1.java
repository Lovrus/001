package DomZad;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/*
Исключения
*/

public class JR_15_8_1 {

    public static int i = (int) (Math.random() * 4);

    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        if (i == 0) {
            throw new NullPointerException();
        } else if (i == 1) {
            throw new ArithmeticException();
        } else if (i == 2) {
            throw new FileNotFoundException();
        } else if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}

