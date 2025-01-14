package Java_H_Schildt.chapter_2_30;
// Использование collect() для создания объектов List и Set из списка.

import java.util.*;
import java.util.stream.*;

public class NamePhoneEmail2 {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail2(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone2 {
    String name;
    String phonenum;

    NamePhone2(String n, String p) {
        name = n;
        phonenum = p;
    }
}

class StreamDemo7 {
    public static void main(String[] args) {
// Список имен, телефонных номеров и адресов электронной почты.
        ArrayList<NamePhoneEmail2> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail2("Larry", "555 - 5555",
                "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail2("James", "555 - 4444",
                "James@HerbShildt.com"));
        myList.add(new NamePhoneEmail2("Mary", "555 - 3333",
                "Mary@HerbShildt.com"));
        // Сопоставить с новым потоком имени и телефонные номера.
        Stream<NamePhone2> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone2(a.name, a.phonenum)
        );
        // Использовать collect() для создания списка List
        // с именами и телефонными номерами.
        List<NamePhone2> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Имена и телефонные номера в  List:");
        for (NamePhone2 e : npList)
            System.out.println(e.name + ": " + e.phonenum);
// Получить еще одно сопоставление имен и телефонных номеров.
        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone2(a.name, a.phonenum)
        );
        // Создать набор Set с применением coooect().
        Set<NamePhone2> npSet = nameAndPhone.collect(Collectors.toSet());
        System.out.println("\nИмена и телефонные номера в Set:");
        for (NamePhone2 e : npSet)
            System.out.println(e.name + ": " + e.phonenum);
    }
}
