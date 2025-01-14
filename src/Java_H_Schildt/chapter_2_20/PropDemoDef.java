package Java_H_Schildt.chapter_2_20;
// Использование стандартного списка свойств.

import java.util.*;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.setProperty("Флорида", "Таллахаси");
        defList.setProperty("Висконсин", "Мадисон");
        Properties capitals = new Properties(defList);
        capitals.setProperty("Иллинойс", "Спрингфилд");
        capitals.setProperty("МИссури", "Джефферсон-Сити");
        capitals.setProperty("Вашингтон", "Олимпия");
        capitals.setProperty("Калифорния", "Сакраменто");
        capitals.setProperty("Индиана", "Индианаполис");
        // Получить представление в виде набора для ключей.
        Set<?> states = capitals.keySet();
        // Отобразить все штаты и их столицы.
        for (Object name : states)
            System.out.println("Столица штата " +
                    name + " - " +
                    capitals.getProperty((String) name)
                    + ".");
        System.out.println();
        // Штат Флорида теперь будет найден в стандартном списке.
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица штата Флорида - " + str + ".");
    }
}
