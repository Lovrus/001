package chapter_1_14;
// В этой версии класса Stats аргумент типа Т должен
// быть классом Nunber или наследуемым от него классом

public class Stats2<T extends Number> {
    T[] nums; // массив класса Number или его подкласса

    // передать конструктору ссылку на массив элементов
    // класса Number или его подкласса
    Stats2(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;

        for (int i = 0; i<nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }
}

// продемонстрировать применение класса Stats2
class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1,2,3,4,5};
        Stats2<Integer> iob = new Stats2<Integer>(inums);
        double v = iob.average();
        System.out.println("Среднее значение iob равно " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5 };
        Stats2<Double> dob = new Stats2<Double>(dnums);
        double w = dob.average();
        System.out.println("Среднее значение dob равно " + w);

        // Этот код не скомпилируется, так как класс String
        // не является производным от класса Number
        // String strs[] = { "1", "2", "3", "4", "5" }
        // Stats2<String> strob = new Stats2<String>(strs);
        // double x = strob.average();
        // System.out.println("Среднее значение strob равно " + v);
    }
}
