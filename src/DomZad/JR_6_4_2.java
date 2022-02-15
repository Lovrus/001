package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JR_6_4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] dom = new int[15];

        for (int i = 0; i < 15; i++) {
            dom[i] = Integer.parseInt(reader.readLine());
        }
        int chet = 0;
        int nechet = 0;
        for (int a = 0; a < 16; a = a + 2) {
            chet += dom[a];
        }
        for (int b = 1; b < 15; b = b + 2) {
            nechet += dom[b];
        }
        if (chet == nechet) return;
        if (chet > nechet) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}

