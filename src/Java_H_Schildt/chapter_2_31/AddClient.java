package Java_H_Schildt.chapter_2_31;

import java.rmi.*;

public class AddClient {
    public static void main(String[] args) {
        try {
            String addServerURL = "rmi://" + args[0] + "/AddServer";
            AddServerIntf addServerIntf =
                    (AddServerIntf) Naming.lookup(addServerURL);
            System.out.println("Первое число: " + args[1]);
            double d1 = Double.valueOf(args[1]).doubleValue();
            System.out.println("Второе число: " + args[2]);
            double d2 = Double.valueOf(args[2]).doubleValue();
            System.out.println("Сумма: " + addServerIntf.add(d1, d2));
        } catch (Exception e) {
            System.out.println("Возникло исключение " + e);
        }
    }
}
