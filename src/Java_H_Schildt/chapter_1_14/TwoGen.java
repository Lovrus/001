package Java_H_Schildt.chapter_1_14;

// Простой обобщенный класс с двумя параметрами типа: Т и V
public class TwoGen<T, V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа T и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // показать типаы T и V
    void showTypes() {
        System.out.println("Тип Т: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

// продемонстрировать применение класса TwoGen
class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj =
                new TwoGen<Integer, String>(88, "Обобщения");

        // показать типы
        tgObj.showTypes();

        // получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
