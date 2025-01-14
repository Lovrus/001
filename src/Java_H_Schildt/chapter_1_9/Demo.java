package Java_H_Schildt.chapter_1_9;
// Демонстрационный пакет р1

// получить экземпляры различных классов из пакета р1
public class Demo {
    public static void main(String[] args) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
