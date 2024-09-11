package chapter_2_29;
// Простой пример применения базовой стретегии "разделяй и властвуй".
// В этом случае используется RecursiveAction.

import java.util.concurrent.*;
import java.util.*;

// Задача ForkJoinTask, которая (через RecursiveAction) трансформирует
// элементы массива значений double в их квадратные корни.
public class SqrtTransform extends RecursiveAction {
    // Произвольно установить пороговое значение в этом примере в 1000.
    // В реальном коде оптимальное пороговое значение может быть
    // выяснено за счет профилирования и эспериментирования.
    final int seqThreshold = 1000;
    // Массив, в который будет осуществляться доступ.
    double[] data;
    // Определить, какую часть данных обрабатывать.
    int start, end;

    SqrtTransform(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    // Метод, в котором будут происходить параллельные вычисления.
    protected void compure() {
        // Если количество элементов меньше порогового значения,
        // тогда обрабатыать последовательно.
        if ((end - start) < seqThreshold) {
            // Трансформировать каждый элемент в его квадратный корень.
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            // В противном случае продолжить разделение данных на меньшие части.
            // Найти среднюю точку.
            int middle = (start + end) / 2;
            // Запустить новые задачи, используя дополнительно разделенные
            // на части данные.
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}
