package DomZad;

import java.io.IOException;
import java.rmi.RemoteException;

/*
Перехват checked исключений
*/

public class JR_15_8_3 {
    public static void main(String[] args) {
        handleExceptions (new JR_15_8_3());
    }

    public static void handleExceptions(JR_15_8_3 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (IOException e) {
            System.out.println(e);
        } catch (NoSuchFieldException e) {
            System.out.println(e);
        }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
