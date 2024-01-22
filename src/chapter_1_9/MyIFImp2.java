package chapter_1_9;

public class MyIFImp2 implements MyIF {
    // В этом классе предоставляются реализации обоих
    // методов getNumber() и getString()
    public int getNumber() {
        return 100;
    }

    public String getString() {
        return "Это другая символьная строка.";
    }
}
