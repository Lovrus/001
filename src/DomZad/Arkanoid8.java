package DomZad;
import java.util.List;

public class Arkanoid8 {
    private int width;
    private int height;
    public static Arkanoid game;

    private Ball8 ball;
    private Stand8 stand;
    private List<Brick8> bricks;

    public Arkanoid8(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball8 getBall() {
        return ball;
    }

    public void setBall(Ball8 ball) {
        this.ball = ball;
    }

    public Stand8 getStand() {
        return stand;
    }

    public void setStand(Stand8 stand) {
        this.stand = stand;
    }

    public List<Brick8> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick8> bricks) {
        this.bricks = bricks;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void run() {

    }

    void move() {

    }

    public static void main(String[] args) {

    }
}