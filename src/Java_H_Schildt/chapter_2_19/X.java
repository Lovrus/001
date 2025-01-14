package Java_H_Schildt.chapter_2_19;

// Получение информации о типе во время выполнения.
public class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}

class RTTI {
    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        Class<?> clObj;
        clObj = x.getClass(); // получить ссылку на Class
        System.out.println(" x - объект типа " +
                clObj.getName());
        clObj = y.getClass(); // получить ссылку на Class
        System.out.println("y - объект типа " +
                clObj.getName());
        System.out.println("Суперклассом у является " +
                clObj.getName());
    }
}
