package DomZad;
/*
Как кошка с собакой
*/

public class JR_17_8_4 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog1 dog = new Dog1("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class Cat {
    private String name;
    private int speed;

    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog1 {
    private String name;
    private int speed;

    public Dog1(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
