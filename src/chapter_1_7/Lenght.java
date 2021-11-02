package chapter_1_7;

// В этой программе домонстируется применение
// свойства Lenght, определяющего длину массива
public class Lenght {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int a2[] = {3, 5, 7, 1, 8, 99, 44, -10};
        int a3[] = {4, 3, 2, 1};

        System.out.println("длина а1 равна " + a1.length);
        System.out.println("длина а2 равна " + a2.length);
        System.out.println("длина а3 равна " + a3.length);
    }
}
