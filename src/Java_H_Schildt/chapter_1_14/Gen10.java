package Java_H_Schildt.chapter_1_14;

// Ситуация, в которой создается мостовой метод.
public class Gen10<T> {
    T ob; // объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т.
    Gen10(T o) {
        ob = o;
    }

    // Возвратить ob.
    T getOb() {
        return ob;
    }
}

// Подкласс Gen11.
class Gen11 extends Gen10<String> {
    Gen11(String o) {
        super(o);
    }

    // Переопределенная версия getOb(), специфичный для String.
    String getOb() {
        System.out.print("Вызван метод getOb(), специфичный для String: ");
        return ob;
    }
}

// Демонстрация ситуации, когда тебуется мостовой метод.
class BridgeDemo {
    public static void main(String[] args) {
        // Создать объект Gen11 для String.
        Gen11 strOb2 = new Gen11("Тест сообщений");
        System.out.println(strOb2.getOb());
    }
}
