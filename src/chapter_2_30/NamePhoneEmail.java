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
