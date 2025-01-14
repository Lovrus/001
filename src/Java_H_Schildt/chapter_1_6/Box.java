package Java_H_Schildt.chapter_1_6;

/* Программа, использующая класс Box
Присвоить исходному файлу имя BoxDemo.java
*/
public class Box {
    double width;
    double height;
    double depth;
}

// В этом классе объявляется объект типа Box
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значение переменных экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // расчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}
