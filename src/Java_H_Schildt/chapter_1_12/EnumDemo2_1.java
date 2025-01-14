package Java_H_Schildt.chapter_1_12;

// Корректировка класса EnumDemo2
enum Apple2_1 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2_1 {
    public static void main(String[] args) {
        Apple2_1 ap;

        System.out.println(
                "Константы перечислимого типа Apple:");

        // применить метод values()

        for (Apple2_1 a : Apple2_1.values())
            System.out.println(a);

        System.out.println();
        // примениь метод valueOf()
        ap = Apple2_1.valueOf("Winesap");
        System.out.println("Переменная ар содержит " + ap);
    }
}
