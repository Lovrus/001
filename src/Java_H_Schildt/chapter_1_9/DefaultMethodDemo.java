package Java_H_Schildt.chapter_1_9;

// Использовать метод с реализцией по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

        // Метод getNumber() можно вызвать, так как он
        // явно реализован в классе MyIFImp:
        System.out.println(obj.getNumber());

        // Метод getString() так же можно вызвать,
        // так как в интерфейсе имеется его реализация
        // по умолчанию:
        System.out.println(obj.getString());
    }
}
