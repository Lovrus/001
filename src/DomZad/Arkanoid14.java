package DomZad;
import java.util.List;

public class Arkanoid14 {
    private int width;
    private int height;
    public static Arkanoid14 game;

    private Ball14 ball;
    private Stand14 stand;
    private List<Brick14> bricks;

    public Arkanoid14(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball14 getBall() {
        return ball;
    }

    public void setBall(Ball14 ball) {
        this.ball = ball;
    }

    public Stand14 getStand() {
        return stand;
    }

    public void setStand(Stand14 stand) {
        this.stand = stand;
    }

    public List<Brick14> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick14> bricks) {
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