package Java_H_Schildt.chapter_1_14;

// Подкласс может добавлять собственные параметры типов.
public class Gen3<T> {
    T ob; // Объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т.
    Gen3(T o) {
        ob = o;
    }

    // Возвратить ob.
    T getOb() {
        return ob;
    }
}

// Подкласс Gen, определяющий второй параметр типа по имени V.
class Gen31<T, V> extends Gen3<T> {
    V ob2;

    Gen31(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}

// Создать объект типа Gen31
class HierDemo {
    public static void main(String[] args) {
        // создать объект Gen31 для String и Integer.
        Gen31<String, Integer> x =
                new Gen31<String, Integer>("Значение: ", 99);

        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}
