package Java_H_Schildt.chapter_1_9;

/* Теперь класс Balance, его конструктор и медо show()
являются открытыми. Это означает, что за пределами
своего пакета они доступн из кода классов, не
производых от классов из их пакета.
 */
public class Balance2 {
    String name;
    double bal;

    public Balance2(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if (bal < 0)
            System.out.print("-->");
        System.out.println(name + ": $" + bal);
    }
}
