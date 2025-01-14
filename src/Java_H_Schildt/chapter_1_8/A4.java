package Java_H_Schildt.chapter_1_8;
// Продемонстрировать порядок вызова конструкторов

// Создать суперкласс
public class A4 {
    A4() {
        System.out.println("В конструкторое А. ");
    }
}

// Создать подкласс путем расширения класса A
class B4 extends A4 {
    B4() {
        System.out.println("В конструкторе В. ");
    }
}

// Создать еще один подкласс путем расширения класса В
class C4 extends B4 {
    C4() {
        System.out.println("В конструкторе С ");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C4 c = new C4();
    }
}
