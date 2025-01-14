package Java_H_Schildt.chapter_1_14;

// Использовать обобщенный конструктор
public class GenCons {
    private final double val2;

    <T extends Number> GenCons(T arg) {
        val2 = arg.doubleValue();
    }

    void showVal() {
        System.out.println("val: " + val2);
    }
}

class GenConsDemo {
    public static void main(String[] args) {

        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);
        test.showVal();
        test2.showVal();
    }
}
