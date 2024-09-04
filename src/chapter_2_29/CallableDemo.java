package chapter_2_29;
// Пример использования Callable.

import chapter_1_13.Hypot;
import chapter_1_7.Factorial;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> f;
        Future<Double> f2;
        Future<Integer> f3;
        System.out.println("Начало");
        f = es.submit(new Sum(10));
        f2 = es.submit(new Hypot3(3, 4));
        f3 = es.submit(new Factorial1(5));
        try {
            System.out.println(f.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
        } catch (InterruptedException exc) {
            System.out.println(exc);
        } catch (ExecutionException exc) {
            System.out.println(exc);
        }
        es.shutdown();
        System.out.println("Конец");
    }
}

// Далее следуют три вычислительных потока.
class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot3 implements Callable<Double> {
    double side1, side2;

    Hypot3(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    public Double call() {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial1 implements Callable<Integer> {
    int stop;

    Factorial1(int v) {
        stop = v;
    }

    public Integer call() {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}
