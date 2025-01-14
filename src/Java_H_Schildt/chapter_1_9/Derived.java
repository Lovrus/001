package Java_H_Schildt.chapter_1_9;

public class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса");
        System.out.println("n =" + n);

        // доступно только для класса
        // System.out.println("n_pri = " 4 + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
