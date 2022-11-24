package DomZad;

public class Pet {
    int x = 5, y = 5;
    int weight = 10;

    Pet(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Cat4 extends Pet {
    int tailLength = 8;
    int age;

    Cat4(int x, int y, int age) {
        super(x, y);
        this.age = age;
    }
}
