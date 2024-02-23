package chapter_1_14;

// Переопределение обобщенного метода в обобщенном классе.
public class Gen8<T> {
    T ob; // Объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т.
    Gen8(T o) {
        ob = o;
    }

    // Возвратить ob.
    T getOb() {
        System.out.print("getOb() в Gen: ");
        return ob;
    }
}

// Подкласс Gen, в котором переопределяется getOb().
class Gen9<T> extends Gen8<T> {
    Gen9(T o) {
        super(o);
    }

    // Переопределить getOb().
    T getOb() {
        System.out.print("getOb() в Gen9: ");
        return ob;
    }
}

// Демонстрация переопделения обобщенного метода.
class OverrideDemo {
    public static void main(String[] args) {
        // Создать объект Gen8 для Integer.
        Gen8<Integer> iOb = new Gen8<Integer>(88);

        // Создать объект Gen9 для Integer.
        Gen9<Integer> iOb2 = new Gen9<Integer>(99);

        // Создать объект Gen9 для String.
        Gen9<String> strOb2 = new Gen9<String>("Тест сообщений");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
