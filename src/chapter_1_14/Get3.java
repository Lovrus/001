package chapter_1_14;

// Простая иерархия обобщенных классов
public class Get3<T> {
    T ob;

    Get3(T o) {
        ob = o;
    }

    // возвратить объект ob
    T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Get3
class Gen4<T> extends Get3<T> {
    Gen4(T o) {
        super(o);
    }
}
