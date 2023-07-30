package DomZad;

import java.util.List;

public class Arkanoid11 {
    private int width;
    private int height;
    public static Arkanoid11 game;

    private Ball11 ball;
    private Stand11 stand;
    private List<Brick11> bricks;

    public Arkanoid11(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball11 getBall() {
        return ball;
    }

    public void setBall(Ball11 ball) {
        this.ball = ball;
    }

    public Stand11 getStand() {
        return stand;
    }

    public void setStand(Stand11 stand) {
        this.stand = stand;
    }

    public List<Brick11> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick11> bricks) {
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