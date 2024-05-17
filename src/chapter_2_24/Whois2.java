package chapter_2_24;

import java.net.*;
import java.io.*;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois2 {
    // Закрытие сокета посредством оператора try с ресурсами.
    public static void main(String[] args) throws Exception {
        int c;
        // Создать сокет, подключенный к internic.net, порт 43.
        // Управлять этим сокетом с помощью блока try  с ресурсами.
        try (Socket s = new Socket("whois.interic.net", 43)) {
            // Получить потоки ввода и вывода.
            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();
            // Сконструировать строку запроса.
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";
            // Преобразовать в байты.
            byte[] buf = str.getBytes();
            // Отправить запрос.
            out.write(buf);
            // Прочитать и отобразить ответ.
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        }
        // Сокет теперь закрыт.
    }
}
