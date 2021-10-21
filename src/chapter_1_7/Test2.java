package chapter_1_7;

// Объекты допускается передавать методам
// в качестве параметров
public class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;
    }

    // возвратить логическое значение true, если в
    // качестве паараметра о указан вызывающий объект
    boolean equalTo2(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}

class PassOb {
    public static void main(String[] args) {
        Test2 ob4 = new Test2(300, 10);
        Test2 ob5 = new Test2(300, 10);
        Test2 ob6 = new Test2(-5, -5);

        System.out.println("ob1 == ob2: " + ob4.equalTo2(ob5));
        System.out.println("ob1 == ob3: " + ob4.equalTo2(ob6));
    }
}
