package DomZad;
public class Stand17 extends BaseObject17 {
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

    public Stand17(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    @Override
    void draw(Canvas17 canvas) {

    }

    @Override
    void move() {
        double dx = speed * direction;
        x = x + dx;
    }

    /**
     * direction устанавливается равным -1
     */
    public void moveLeft() {
        direction = -1;
    }

    /**
     * direction устанавливается равным +1
     */
    public void moveRight() {
        direction = 1;
    }
}