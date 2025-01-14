package Java_H_Schildt.chapter_2_29;
// Простой пример применения базовой стратегии "разделяй и властвуй".
// В этом случае используется RecursiveAction.

import java.util.concurrent.*;
import java.util.*;

import static java.util.concurrent.ForkJoinTask.invokeAll;

// Задача ForkJoinTask, которая (через RecursiveAction) трансформирует
// элементы массива значений double в их квадратные корни.
abstract class SqrtTransform extends RecursiveAction {
    // Произвольно установить пороговое значение в этом примере в 1000.
    // В реальном коде оптимальное пороговое значение может быть
    // выяснено за счет профилирования и экспериментирования.
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
        // тогда обрабатывать последовательно.
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
            invokeAll(new SqrtTransform(data, start, middle) {
                          @Override
                          protected void compute() {

                          }
                      },
                    new SqrtTransform(data, middle, end) {
                        @Override
                        protected void compute() {

                        }
                    });
        }
    }
}

// Демонстрация параллельного выполнения.
class ForkJoinDemo {
    public static void main(String[] args) {
        // Создать пул задач.
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[10000];
        // Присвоить nums ряд значений.
        for (int i = 0; i < 10; i++)
            System.out.println(nums[i] + " ");
        System.out.println("\n");
        SqrtTransform task = new SqrtTransform(nums, 0, nums.length) {
            @Override
            protected void compute() {

            }
        };
// Запустить главную задачу ForkJoinTask.
        fjp.invoke(task);
        System.out.println("Часть трансформированный последовательности" +
                " (с четырьмя знаками после десятичной точки) : ");
        for (int i = 0; i < 10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();
    }
}
