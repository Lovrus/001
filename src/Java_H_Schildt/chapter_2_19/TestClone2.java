package Java_H_Schildt.chapter_2_19;

// Переопределение метода clone().
public class TestClone2 implements Cloneable {
    int a;
    double b;

    // Метод clone() теперь переопределен и является открытым.
    public Object clone() {
        try {
            // Вызвать clone() из Object.
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не разрешено.");
            return this;
        }
    }
}

class CloneDemo2 {
    public static void main(String[] args) {
        TestClone2 x1 = new TestClone2();
        TestClone2 x2;
        x1.a = 10;
        x1.b = 20.98;
        // Здесь метод clone() вызывается напрямую.
        x2 = (TestClone2) x1.clone();
        System.out.println("x1: " + x1.a + " " + x1.b);
        System.out.println("x2: " + x2.a + " " + x2.b);
    }
}