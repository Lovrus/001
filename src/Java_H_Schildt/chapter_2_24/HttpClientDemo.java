package Java_H_Schildt.chapter_2_24;
// Демонстрация использования HttpClient.

import java.net.*;
import java.net.http.*;
import java.io.*;
import java.util.*;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        // Получить клиент со стандартными параметрами.
        HttpClient myHC = HttpClient.newHttpClient();
        // Создать запрос.
        HttpRequest myReq = HttpRequest.newBuilder(
                new URI("http://www.google.com/")).build();
        // Отправить запрос и получить ответ. Для тела применяется объект InputStream.
        HttpResponse<InputStream> myResp = myHC.send(myReq,HttpResponse.BodyHandlers.ofInputStream());
        /* Отобразить код ответа и метод запроса. */
        System.out.println("Код ответа: " + myResp.statusCode());
        System.out.println("Метод запроса: " + myReq.method());
        // Получить заголовок из ответа.
        HttpHeaders hdrs = myResp.headers();
        // Получить карту с полями заголовка.
        Map<String, List<String>> hdrMap = hdrs.map();
        Set<String> hdrField = hdrMap.keySet();
        System.out.println("\nЗаголовок:");
        // Отобразить все ключи и значения заголовка.
        for (String k : hdrField) {
            System.out.println(" Ключ: " + k + " Значение: " + hdrMap.get(k));
            // Отобразить тело.
            System.out.println("\nТело: ");
            InputStream input = myResp.body();
            int c;
            // Прочитать и отобразить все тело.
            while ((c = input.read()) != -1) {
                System.out.println((char) c);
            }
        }
    }
}
