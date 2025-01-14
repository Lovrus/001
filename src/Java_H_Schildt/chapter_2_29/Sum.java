package Java_H_Schildt.chapter_2_29;
// Простой пример использования RecursiveTask<V>.

import java.util.concurrent.*;

// Задача RecurrsiveTask, которая вычисляет сумму значений
// в массиве типа double.
abstract class Sum extends RecursiveTask<Double> {
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
    protected Double compure() {
        double sum = 0;
        // Если количество элементов меньше порогового значения,
        // тогда обрабатывать последовательно.
        if ((end - start) < seqThresHold) {
            // Суммировать элементы.
            for (int i = start; i < end; i++)
                sum += data[i];
        } else {
            // В противном случае продолжить разделение данных на меньшие части.
            // Найти среднюю точку.
            int middle = (start + end) / 2;
            // Запустить новые задачи, используя дополнительно разделенные
            // на части данные.
            Sum subTaskA = new Sum(data, start, middle) {
                @Override
                protected Double compute() {
                    return 0.0;
                }
            };
            Sum subTaskB = new Sum(data, middle, end) {
                @Override
                protected Double compute() {
                    return 0.0;
                }
            };
            // Запустить все задачи с помощью fork().
            subTaskA.fork();
            subTaskB.fork();
            // Ожидать, пока подзадачи возвратят управление,
            // и объединить результаты.
            sum = subTaskA.join() + subTaskB.join();
        }
        // Возвратить окончательную сумму.
        return sum;
    }
}

// Демонстрация параллельного выполнения.
class RecurTaskDemo {
    public static void main(String[] args) {
        // Создать пул задач.
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];
        // Иницилизировать nums чередующимся положительными
        // и отрицательными значениями.
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        Sum task = new Sum(nums, 0, nums.length) {
            @Override
            protected Double compute() {
                return 0.0;
            }
        };
// Запустить задачи ForkJoinTask. Обратите внимание,
        // что в этом случае метод invoke() возвращает результат.
        double summatiom = fjp.invoke(task);
        System.out.println("Результат суммирования: " + summatiom);
    }
}
