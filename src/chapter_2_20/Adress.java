package chapter_2_20;
// Простой пример работы со списком почтовых адресов.

import java.util.*;

public class Adress {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    Adress(String n, String s, String c,
           String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }

    public String toString() {
        return name + " \n" + street + "\n" + city + " " + state + " " + code;
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Adress> ml = new LinkedList<>();
        // Добавить элементы в связный список.
        ml.add(new Adress("J.W. West", "11 Oak Ave",
                "Urbana", "IL", "61801"));
        ml.add(new Adress("Ralph Baker", "1142 Maple Lane",
                "Mahomet", "IL", "61853"));
        ml.add(new Adress("Tom Carlton", "867 Elm St",
                "Champaign", "IL", "61820"));
        // Отобразить содержимое списка почтовых адресов.
        for (Adress element : ml)
            System.out.println(element + "\n");
        System.out.println();
    }
}
