package Java_H_Schildt.chapter_1_7;

// Объекты передаются по ссылке на них
public class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    // передать объект
    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println(" ob.a и ob.b до вызова: " +
                ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println(" ob.a и ob.b после вызова: " +
                ob.a + " " + ob.b);
    }
}
