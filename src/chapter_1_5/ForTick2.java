package chapter_1_5;

// Объявить переменную управления циклом в самом цикле for
public class ForTick2 {
    public static void main(String[] args) {

        // здесь переменная n объявляется в самом цикле for
        for (int n = 0; n > 0; n--)
            System.out.println("такт" + n);
    }
}
