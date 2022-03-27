package chapter_1_12;
// Воспользоваться встроенными в перчисление методами

// Перечисление сортов яблок
enum Apple2 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        System.out.println(
                "Константы перечислимого типа Apple:");

        // применить метод values()
        Apple[] allapples = Apple.values();
        for (Apple a : allapples)
            System.out.println(a);

        System.out.println();
        // примениь метод valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("Переменная ар содержит " + ap);
    }
}
