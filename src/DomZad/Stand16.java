package DomZad;
public class Stand16 extends BaseObject16 {
    //скорость
    private double speed;
    //направление (-1 влево, +1 вправо)
    private double direction;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public Stand16(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    void draw(Canvas16 canvas) {

    }

    @Override
    void move() {

    }
}