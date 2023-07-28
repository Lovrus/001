package DomZad;
import java.util.List;

public class Arkanoid10 {
    private int width;
    private int height;
    public static Arkanoid10 game;

    private Ball10 ball;
    private Stand10 stand;
    private List<Brick10> bricks;

    public Arkanoid10(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball10 getBall() {
        return ball;
    }

    public void setBall(Ball10 ball) {
        this.ball = ball;
    }

    public Stand10 getStand() {
        return stand;
    }

    public void setStand(Stand10 stand) {
        this.stand = stand;
    }

    public List<Brick10> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick10> bricks) {
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