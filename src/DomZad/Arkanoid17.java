package DomZad;

import java.util.List;

public class Arkanoid17 {
    private int width;
    private int height;
    public static Arkanoid17 game;

    private Ball17 ball;
    private Stand17 stand;
    private List<Brick17> bricks;

    public Arkanoid17(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball17 getBall() {
        return ball;
    }

    public void setBall(Ball17 ball) {
        this.ball = ball;
    }

    public Stand17 getStand() {
        return stand;
    }

    public void setStand(Stand17 stand) {
        this.stand = stand;
    }

    public List<Brick17> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick17> bricks) {
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
