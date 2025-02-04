package Java_H_Schildt.chapter_2_20;
// Простая база данных телефонных номеров, которая использует список свойств.

import java.util.*;
import java.io.*;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in, System.console().charset()));
        String name, number;
        FileInputStream fin = null;
        boolean changed = false;
        // Попробовать открыть файл phonebook.dat.
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // Игнорировать отсутствие файла.
        }
        /* Если файл phonebook.dat существует, тогда загрузить на него номера
        телефоно. */
        try {
            if (fin != null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
        }
        // Предоставить пользователю возможность вводить новые имена и номера.
        do {
            System.out.println("Введите новое имя" +
                    "quit для завершения): ");
            name = br.readLine();
            if (name.equals("quit")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.setProperty(name, number);
            changed = true;
        } while (!name.equals("quit"));
        // Если данные телефонного справочника изменились, тогда сохранить его.
        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонный справочник");
            fout.close();
        }
        // Искать номера по заданному имени.
        do {
            System.out.println("Введите интересующее имя" +
                    "quit для завершения): ");
            name = br.readLine();
            if (name.equals("quit")) continue;
            ;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("quit"));
    }
}
