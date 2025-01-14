package Java_H_Schildt.chapter_1_14;

// Обобщения и массивы.
public class Gen12<T extends Number> {
    T ob;
    T[] vals; // Нормально

    Gen12(T o, T[] nums) {
        ob = o;
        // Этот оператор не допустим.
        // vals = new T[10}; // невозможно создать массив элементов типа Т
        // Но следующий оператор законен.
        vals = nums; // присваивать ссылку на существующий массив разрешено.
    }
}

class GenArrays {
    public static void main(String[] args) {
        Integer[] n = {1, 2, 3, 4, 5};
        Gen12<Integer> iOb = new Gen12<Integer>(50, n);
        // Невозможно создать массив обобщенных ссылок для конкретного типа.
        //Gen12<Integer>[] gens = new Gen12<Integer>[10}; // Ошибка!

        // Все нормлаьно.
        Gen12<?>[] gens = new Gen12<?>[10];
        // нормально
    }
}
