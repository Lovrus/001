package Java_H_Schildt.chapter_1_19;
// Использовать список свойств по умолчанию

import java.util.*;

public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Висконсин", "Мэдисон");
        Properties capitals = new Properties(defList);
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // вывести все штаты и их столицы
        for (Object name : states)
            System.out.println("Столица штата " + name + " - "
                    + capitals.getProperty((String) name) + ".");
        System.out.println();

        // Теперь штат Флорида будет найден
        // в списке по умолчанию
        String str = capitals.getProperty("Флорида");
        System.out.println("Столица Флориды - " + str + " . ");
    }
}
