package Java_H_Schildt.chapter_1_8;

// Переменная из суперкласса может ссылаться на объект подкласса
public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Объем weightbox равен " + vol);
        System.out.println("Вес weightbox равен "
                + weightbox.weight);
        System.out.println();

        //присвоить переенной ссылки на объект типа BoxWeight
        // ссылку на объект типа Box
        plainbox = weightbox;
        vol = plainbox.volume(); // Верно, так как метод  volume()
        // определен в классе Box
        System.out.println("Объем plainbox равен " + vol);

        /* Следующий оператор ошиочен, посколько член plainbox
        не определяет член weight. */
        // System.out.println(
        //  "Вес plainbox равен " + plainbox.weight);
    }
}
