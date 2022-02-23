package DomZad;

/*
Правильный порядок
*/
public class JR_7_2_3 {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        ivan(array);
        reverseArray(array);
        ivan(array);
    }

    public static void reverseArray(int[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length/2; i++) {
            int t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
    }

    public static void ivan(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}




