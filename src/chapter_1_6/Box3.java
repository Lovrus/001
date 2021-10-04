package chapter_1_6;
// Теперь метод volume() возвращает объем параллелепипеда
class Box3 {
    double width;
    double height;
    double depth;

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol = 0;

        //присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        /* присвоить другие значения переменнным
        экземпляра mybox2 */
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}