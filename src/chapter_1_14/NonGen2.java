package chapter_1_14;

// Необобщенный класс может быть суперклассом обобщенного подкласса.
// Необобщенный класс.
public class NonGen2 {
    int num;

    NonGen2(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

// Обобщенный подкласс.
class Gen5<T> extends NonGen2 {
    T ob; // Объявить объект типа Т

    // Передать конструктору ссылку на объект типа Т.
    Gen5(T o, int i) {
        super(i);
        ob = o;
    }

    // Возвратить ob.
    T getOb() {
        return ob;
    }
}

// Создать объект Gen5
class HierDemo2 {
    public static void main(String[] args) {

        // Создать объект Gen для String.
        Gen5<String> w = new Gen5<String>("Добро пожаловать", 47);
        System.out.print(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
