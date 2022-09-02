package DomZad;
/*
Обратный отсчет от 5 до 0
*/

public class JR_16_5_2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

