package Java_H_Schildt.chapter_1_14;
// Ограниченные матесимвольные аргументы

// Двухмерные координаты
public class TwoD2 {
    int x, y;

    TwoD2(int a, int b) {
        x = a;
        y = b;
    }
}

// Трехмерные координаты
class TtreeD2 extends TwoD2 {
    int z;

    TtreeD2(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

// Четырехмерные координаты
class FourD2 extends TtreeD2 {
    int t;

    FourD2(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}

// Этот класс хранит массив координатных объектов
class Coords2<T extends TwoD2> {
    T[] coords2;

    Coords2(T[] o) {
        coords2 = o;
    }
}

// Продемонстировать применение ограниченных
// метасимволов подстановки
class BoundedWildcard {
    static void showXY2(Coords2<?> c) {
        System.out.println("Координаты X Y:");
        for (int i = 0; i < c.coords2.length; i++)
            System.out.println(c.coords2[i].x + " " + c.coords2[i].y);
        System.out.println();
    }

    static void showXYZ2(Coords2<? extends TtreeD2> c) {
        System.out.println("Координаты X,Y,Z:");
        for (int i = 0; i < c.coords2.length; i++)
            System.out.println(c.coords2[i].x + " "
                    + c.coords2[i].y + " "
                    + c.coords2[i].z);
        System.out.println();
    }

    static void showAll2(Coords2<? extends FourD2> c) {
        System.out.println("Координаты X Y Z T:");
        for (int i = 0; i < c.coords2.length; i++)
            System.out.println(c.coords2[i].x + " "
                    + c.coords2[i].y + " "
                    + c.coords2[i].z + " "
                    + c.coords2[i].t);
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD2 td[] = {
                new TwoD2(0, 0),
                new TwoD2(7, 9),
                new TwoD2(18, 4),
                new TwoD2(-1, -23)
        };

        Coords2<TwoD2> tdlocs = new Coords2<TwoD2>(td);

        System.out.println("Содержимое объекта tdlocs.");
        showXY2(tdlocs); //Верно, это тип TwoD2
        // showXYZ2(tdlocs); // Ошибка, это не тип ThreeD2
        // showAll2(tdlocs); // Ошибка, это не тип FourD2

        // а теперь создать несколько объектов типа FourD2
        FourD2[] fd = {
                new FourD2(1, 2, 3, 4),
                new FourD2(6, 8, 14, 8),
                new FourD2(22, 9, 4, 9),
                new FourD2(3, -2, -23, 17)
        };

        Coords2<FourD2> fdlocs = new Coords2<FourD2>(fd);

        System.out.println("Содержимое объекта fdlocs.");
        // Здесь все верно
        showXY2(fdlocs);
        showXYZ2(fdlocs);
        showAll2(fdlocs);
    }
}
