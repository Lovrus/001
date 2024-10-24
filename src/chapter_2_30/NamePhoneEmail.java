package chapter_2_30;
// Использование метода map() для создания нового потока,
// который содержит избранные значения исходного потока.

import java.util.*;
import java.util.stream.*;

public class NamePhoneEmail {
    String name;
    String phonenum;
    String email;

    NamePhoneEmail(String n, String p, String e) {
        name = n;
        phonenum = p;
        email = e;
    }
}

class NamePhone {
    String name;
    String phonenum;

    NamePhone(String n, String p) {
        name = n;
        phonenum = p;
    }
}

class StreamDemo5 {
    public static void main(String[] args) {
// Список имен, телефонных номоеров и адресов электронной почты.
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555 - 5555",
                "Larry@HerbShildt.com"));
        myList.add(new NamePhoneEmail("James", "555 - 4444",
                "James@HerbShildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555 - 3333",
                "Mary@HerbShildt.com"));
    }
}
