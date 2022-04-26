package DomZad;

/*
Вызов конструктора из конструктора
*/
public class JR_10_6_6 {


    public double x;
    public double y;
    public double radius;

    public JR_10_6_6(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public JR_10_6_6(double x, double y) {
        //напишите тут ваш код
        this(x, y, 10);
    }

    public JR_10_6_6() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        JR_10_6_6 circle = new JR_10_6_6();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        JR_10_6_6 anotherCircle = new JR_10_6_6(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}

