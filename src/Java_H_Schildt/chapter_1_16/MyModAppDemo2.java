package Java_H_Schildt.chapter_1_16;

import java.util.ServiceLoader;

// Модульное приложение, демонстрирующее использование служб
// и поставщиков служб.
public class MyModAppDemo2 {
    public static void main(String[] args) {
        // Первым делом использовать встренные функции, как и раньше.
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 является делителем 10");
        System.out.println("Наименьший общий делитель для 35 и 105 равен " +
                SimpleMathFuncs.lcf(35, 105));
        System.out.println("Наибольший общий делитель для 35 и 105 равен " +
                SimpleMathFuncs.gcf(35, 105));
        // Теперь использовать пользовательские операции, основанные на службах
        // Получить загрузчик служб для бинарных функций.
        ServiceLoader<BinFuncsProvider> ldr =
                ServiceLoader.load(BinFuncsProvider.class);
        BinaryFunc binOp = null;
        // Найти поставщика для absPlus и получить функцию.
        for (BinFuncsProvider bfp : ldr) {
            if (bfp.get().getName().equals("absPlus")) {
                binOp = bfp.get();
                break;
            }
        }
        if (binOp != null)
            System.out.println("Результат выполнения функции absPlus: " +
                    binOp.func(12, -4));
        else
            System.out.println("Функция absPlus не найдена.");
        binOp = null;
        // Найти поставвщика для absMinus и получить функцию.
        for (BinFuncsProvider bfp : ldr) {
            if (bfp.get().getName().equals("absMinus")) {
                binOp = bfp.get();
                break;
            }
        }
        if (binOp != null)
            System.out.println("Результат выполнения функции absMinus: " +
                    binOp.func(12, -4));
        else
            System.out.println("Функция absMinus не найдена.");
    }
}
