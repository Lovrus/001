package chapter_1_15;

// Демонстрация использования ссылки на обобщенный метод,
// объявленный внутри необобщенного класса.
// Функциональный интерес, который работает с массивом
// и значением и возвращает результат int.
public interface MyFunc3<T> {
    int func(T[] vals, T v);
}

// В этом классе определен метод по имени countMatching(), который
// возвращает количество элементов в массиве, равных указанному значению.
// Обратите внимание, что метод countMatching() яввляется обобщенным,
// но класс MyArrayOps - нет.
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++)
            if (vals[i] == v)
                count++;
        return count;
    }
}

class GenericMethodRefDemo {
    // Первый параметр этого метода имеет тип функционального интерфейса MyFunc.
    // В остальных двух параметрах он принимает массив и значение, оба типа Т.
    static <T> int myOp(MyFunc3<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"One", "Two", "Three", "Two"};
        int count;
        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Количество элементов 4, содержащихся в vals: " + count);
        count = myOp(MyArrayOps::<String>countMatching, strs, "Two");
        System.out.println("Количество элементов Two, содержащихся в strs: " + count);
    }
}
