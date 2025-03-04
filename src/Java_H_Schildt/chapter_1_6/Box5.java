package Java_H_Schildt.chapter_1_6;

//В этой программе применяется метод с параметрами
public class Box5 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // иницилизировать каждый экземпляр класса Box5
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
