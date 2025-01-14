package Java_H_Schildt.chapter_1_9;

// Глава 9. Пример доступа к пакетам - продолжение
public class Protection2 extends Protection {
    Protection2() {
        System.out.println(
                "конструктор, унаследованный из другого пакета");
        // доступно только для данного класса или пакет
        // System.out.println("n = " + n);

        // доступно только для данного класса
        // System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
