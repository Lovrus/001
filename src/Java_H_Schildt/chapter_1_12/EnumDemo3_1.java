package Java_H_Schildt.chapter_1_12;

// Использовать констукторы в перечислении
// и метод в перечислении
enum Apple31 {
    Jonathan(10), GolenDel(9), RedDel,
    Winesap(15), Cortlamd(8);

    private int price; // цена яблока каждого сора

    // Конструктор
    Apple31(int p) {
        price = p;
    }
// Перегружаемый конструктор
    Apple31() {price = -1; }

    int getPrice() {
        return price;
    }
}
public class EnumDemo3_1 {
    public static void main(String[] args) {
        Apple31 ap;

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит "
                + Apple31.Winesap.getPrice()
                + " центов. \n");
        // вывести цена на все сорта яблок
        System.out.println("Цены на все сорта яблок:");
        for (Apple31 a : Apple31.values())
            System.out.println(a + " стоит " + a.getPrice()
                    + " центов.");
    }
}
