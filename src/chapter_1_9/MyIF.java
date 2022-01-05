package chapter_1_9;

public interface MyIF {
    // Это объявление обычного метода в интерфейфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

    // А это обявлеие метода с реализацией по умочанию.
    // Обратите внимание на его реализацию по умолчанию
    default  String getString() {
        return "Объект типа String по умолчанию";
    }
}

// Реалиовать интерфейс myIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только
    // метод getNumber(), определенный в интерфейсе MyIF
    // А вызов метода getString() разрешается по умолчанию
    public int getNumber() {
        return 100;
    }
}