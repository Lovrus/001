package Java_H_Schildt.chapter_1_9;

interface IntStack2 {
    void push(int item);// сохранить элемент в стеке

    int pop(); // извлечь элемент из стека

    // У метода clear() теперь имеется вариант, доступный
    // по умолчанию, и поэтому его придется реализовать
    // в том заранее существующем классе, где уже
    // применяется интерфейс IntStack
    default void clear() {
        System.out.println("Метод clear() не реализован.");
    }
}
