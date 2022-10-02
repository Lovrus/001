package DomZad;

public class JR_18_10_1 {
    public void voice() {
        System.out.println("Голос!");
    }
}

class Bear extends JR_18_10_1 {
    @Override
    public void voice() {
        System.out.println("Р-р-р!");
    }
}

class Cat2 extends JR_18_10_1 {
    @Override
    public void voice() {
        System.out.println("Мяу!");
    }
}

class Dog2 extends JR_18_10_1 {
    @Override
    public void voice() {
        System.out.println("Гав!");
    }
}

class Snake extends JR_18_10_1 {
    @Override
    public void voice() {
        System.out.println("Ш-ш-ш!");
    }
}

class Main {
    public static void main(String[] args) {
        JR_18_10_1 animal1 = new Dog2();
        JR_18_10_1 animal2 = new Cat2();
        JR_18_10_1 animal3 = new Bear();
        JR_18_10_1 animal4 = new Snake();

        animal1.voice();
        animal2.voice();
        animal3.voice();
        animal4.voice();

    }
}
