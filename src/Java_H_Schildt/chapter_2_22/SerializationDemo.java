package Java_H_Schildt.chapter_2_22;
// Демонстрация использования сериализации.

import Java_H_Schildt.chapter_1_13.MyClass;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        // Сериализация объекта.
        try (ObjectOutputStream objOStrm =
                     new ObjectOutputStream(new FileOutputStream("serial"))) {
            MyClass2_22 object1 = new MyClass2_22("Hello", -7, 2.7e10);
            System.out.println("object1: " + object1);
            objOStrm.writeObject(object1);
        } catch (IOException e) {
            System.out.println("Во время сериализции возниколо искключение: " + e);
        }
        // Десериализация объекта.
        try (ObjectInputStream objIStrm =
                     new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass2_22 object2 = (MyClass2_22) objIStrm.readObject();
            System.out.println("object2: " + object2);
        } catch (Exception e) {
            System.out.println("Во время десериализации возникло исключение: " + e);
        }
    }
}

class MyClass2_22 implements Serializable {
    String s;
    int i;
    double d;

    public MyClass2_22(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    public String toString() {
        return "s=" + s + "; i=" + i + "; d=" + d;
    }
}
