package Java_H_Schildt.chapter_1_13;

// Продемонстировать применение операции instanceof
class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

class InsanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        if (a instanceof A)
            System.out.println("а является кземпляром А");
        if (b instanceof B)
            System.out.println("b является кземпляром B");
        if (c instanceof C)
            System.out.println("c является кземпляром C");
        if (c instanceof A)
            System.out.println("c можно привести к типу А");
        if (a instanceof C)
            System.out.println("c можно привести к типу С");

        System.out.println();

        // сравнить с порожденными типами
        A ob;
        ob = d; // ссылка на объект d
        System.out.println("ob теперь ссылается на d");
        if (ob instanceof D)
            System.out.println("ob является экземпляром D");

        System.out.println();

        ob = c; // ссылка на c
        System.out.println("ob теперь ссылается на c");

        if (ob instanceof D)
            System.out.println("ob можно привести к типу D");
        else
            System.out.println("ob нельзя привести к типу D");

        if (ob instanceof A)
            System.out.println("ob можно привести к типу A");

        System.out.println();

        // все объекты могут быть приведены к типу Object
        if (a instanceof Object)
            System.out.println("а можно привести к типу Object");
        if (b instanceof Object)
            System.out.println("b можно привести к типу Object");
        if (c instanceof Object)
            System.out.println("с можно привести к типу Object");
        if (d instanceof Object)
            System.out.println("d можно привести к типу Object");
    }
}
