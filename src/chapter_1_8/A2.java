package chapter_1_8;
/* В иерархии классов закрытые члены остаются
закрытыми в пределах своего класса.
Эта программа содержит ошибку, и поэтому
она не подлежит компиляции. */

// Содать суперкласс
class A2 {
    int i; // этот член открыт по умолчанию,
    private int j; // а этот член закрыт в классе А

    void setij (int x, int y) {
        i = x;
        j = y;
    }
}

//Член j класса А в этом классе недоступен
class B2 extends A2 {
    int total;

    void sum() {
       // total = i + j; // ОШИБКА: член j в этом
        // классе недоступен
    }
}

class Access {
    public static void main(String[] args) {
        B2 subOb = new B2();

        subOb.setij(10,12);

        subOb.sum();
        System.out.println("Сумма равна " + subOb.total);
    }
}
