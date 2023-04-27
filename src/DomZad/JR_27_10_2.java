package DomZad;

import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Десериализация
*/

public class JR_27_10_2 {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            return (Solution.A) objectStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}