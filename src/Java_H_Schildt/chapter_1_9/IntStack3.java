package Java_H_Schildt.chapter_1_9;

// Очередная версия интерфейса IntStack с закрытым
// методом, применяемым в двух реализумых по
// умолчанию методах.
public interface IntStack3 {
    void push(int item); // сохранить элемент в стеке.

    int pop(); // извлечь элемент из стека

    // Ьетод с реализацией по умолчанию, возвращающий
    // массив из n элементов, начиная с вершины стека
    default int[] popNElements(int n) {
        // возвратить запрашиваемы элементы из стека
        return getElements(n);
    }

    // Метод с реализацией по умолчанию, возвращающий
    // из стека массив из n элементов, следующих после
    // указанного количества пропускаемых элементов
    default int[] skipAndElements(int skip, int n) {
        // пропустить указанное количество элементов в стеке
        getElements(skip);
        // возвратить запрашиваемы эементы из стека
        return getElements(n);
    }

    // закрытый метод, возвращающий массив из n элементов,
    // начиная с вершины стека
    private int[] getElements(int n) {
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) elements[i] = pop();
        return elements;
    }
}
