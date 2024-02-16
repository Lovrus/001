package chapter_1_14;
// Использование подстановочного знака.

public class Stats3<T extends Number> {
    T[] nums; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив
    // элементов класса Number или его подкласса
    Stats3(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }

    // Выяснить, одинаковые ли два средних значения
    // Обратите внимание на использование подстановочного знака.

    boolean isSameAvg(Stats3<?> ob) {
        if (average() == ob.average())

            return true;

        return false;
    }
}

// Продемонстрировать применение метасимвола подстановки
class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats3<Integer> iob = new Stats3<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднеее значение iob равно " + v);

        Double[] dmums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats3<Double> dob = new Stats3<Double>(dmums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats3<Float> fob = new Stats3<Float>(fnums);
        double x = fob.average();
        System.out.println("Среднее значение fob равно " + x);

// выяснить какие массивы имеют
        // одинаковые средние значения
        System.out.print("Среднее значение iob и dob ");
        if (iob.isSameAvg(dob))
            System.out.println("равны.");
        else
            System.out.println("отличаются");

        System.out.print("Среднаие iob и fob ");
        if (iob.isSameAvg(fob))
            System.out.println("одинаковы.");
        else
            System.out.println("отличаются.");
    }
}
