package DomZad;

public class Ball14 extends BaseObject14 {

    //скорость
    private double speed;
    //направление  (в градусах от 0 до 360)
    private double direction;

    //текущее значение вектора движения (dx,dy)
    private double dx;
    private double dy;

    //заморожен ли объект или может двигаться
    private boolean isFrozen;

    public Ball14(double x, double y, double speed, double direction) {
        super(x, y, 1);

        this.direction = direction;
        this.speed = speed;

        this.isFrozen = true;
    }

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    @Override
    void draw(Canvas14 canvas) {
        canvas.setPoint(x, y, 'O');
    }

    @Override
    void move() {
        if (!isFrozen) {
            x += dx;
            y += dy;
        }
    }

    public void start() {
        this.isFrozen = false;
    }
}
