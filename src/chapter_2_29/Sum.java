package chapter_2_29;
// Простой пример использования RecursiveTask<V>.
import java.util.concurrent.*;
// Задача RecurrsiveTask, которая вычисляет сумму значений
// в массиве типа double.
public class Sum extends RecursiveTask<Double> {
    // Порог последовательной обработки.
    final int seqThresHold = 500;
    // Массив,  в который будет осуществляться доступ.
    double[] data;
    // Определить, какую часть данных обрабатывать.
    int start, end;
Sum(double[] vals, int s, int e) {
    data = vals;
    start = s;
    end = e;
}
// Найти сумму значений в массиве типа double.
}
