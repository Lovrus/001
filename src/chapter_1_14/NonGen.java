package chapter_1_14;
// Класс NonGen - функциональный эквивалент
// класса Gen без обобщений

public class NonGen {
    Object ob; // объект ob теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    NonGen(Object o) {
        ob = o;
    }

    // вовзаратить тип Object
    Object getOb() {
        return ob;
    }

    // показать тип объекта ob
    void showType() {
        System.out.println("Объект ob относится к типу "
                + ob.getClass().getName());
    }
}

// продемонстировать необобщенный класс
class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(88);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменноой iOb,
        // на этот раз требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать другой объект типа NonGen и
        // схранить в нем объект типа String
        NonGen strOb = new NonGen("Тест без обобщений");

        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();

        // получить значение переменной strOb,
        // и в этом случае потребуется приведене типов
        String str = (String) strOb.getOb();
        System.out.println("Значение: " + str);

        // Этот код компилируется,но
        // он принципиально неверный!
        iOb = strOb;
        v = (Integer) iOb.getOb(); // Ошибка во время выполнения!
    }
}
