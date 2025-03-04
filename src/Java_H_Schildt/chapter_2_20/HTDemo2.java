package Java_H_Schildt.chapter_2_20;
// Использование итераторов с Hashtable.

import java.util.*;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance =
                new Hashtable<>();
        String str;
        double bal;
        balance.put("John Doe", 3434.34);
        balance.put("Tom Smith", 123.22);
        balance.put("Jane Baker", 1378.00);
        balance.put("Tod Hall", 99.22);
        balance.put("Ralph Smith", -19.08);
        // Отобразить балансы всех счетов из хеш-таблицы.
        // Для начала получить представление в виде набора для ключей.
        Set<String> set = balance.keySet();
        // Получить итератор.
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " +
                    balance.get(str));
        }
        System.out.println();
        // Пополнить счет клиента John Doe на 1000.
        bal = balance.get("John Doe");
        balance.put("John Doe", bal + 1000);
        System.out.println("Новый балан клиента  John Doe: " +
                balance.get("John Doe"));
    }
}
