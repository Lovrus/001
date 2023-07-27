package DomZad;
import java.util.List;

public class Arkanoid9 {
    private int width;
    private int height;
    public static Arkanoid game;

    private Ball9 ball;
    private Stand stand;
    private List<Brick> bricks;

    public Arkanoid9(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball9 getBall() {
        return ball;
    }

    public void setBall(Ball9 ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
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