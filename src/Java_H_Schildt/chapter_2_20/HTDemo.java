package Java_H_Schildt.chapter_2_20;
// Демонстрация использования Hashtable.

import java.util.*;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance =
                new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;
        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);
        // Отобразить балансы все счето из хеш-таблицы.
        names = balance.keys();
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + ": " +
                    balance.get(str));
        }
        System.out.println();
        // Пополнить сет клиента John Doe на 1000.
        bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("Новый баланс клиента John Doe: " +
                balance.get("John Doe"));
    }
}
