package DomZad;

import java.util.List;

public class Arkanoid15 {
    private int width;
    private int height;
    public static Arkanoid game;

    private Ball15 ball;
    private Stand15 stand;
    private List<Brick15> bricks;

    public Arkanoid15(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball15 getBall() {
        return ball;
    }

    public void setBall(Ball15 ball) {
        this.ball = ball;
    }

    public Stand15 getStand() {
        return stand;
    }

    public void setStand(Stand15 stand) {
        this.stand = stand;
    }

    public List<Brick15> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick15> bricks) {
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
