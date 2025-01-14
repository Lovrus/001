package Java_H_Schildt.chapter_1_12;

// Использовать констуктор, переменную экземпляра
// и метод в перечислении
enum Apple3 {
    Jonathan(10), GolenDel(9), RedDel(12),
    Winesap(15), Cortlamd(8);

    private int price; // цена яблока каждого сорта

    // Конструктор
    Apple3(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 ap;

        // вывести цену на яблоко сорта Winesap
        System.out.println("Яблоко сорта Winesap стоит "
                + Apple3.Winesap.getPrice()
                + " центов. \n");
        // вывести цены на все сорта яблок
        System.out.println("Цены на все сорта яблок:");
        for (Apple3 a : Apple3.values())
            System.out.println(a + " стоит " + a.getPrice()
                    + " центов.");
    }
}
