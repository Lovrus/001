package DomZad;

import java.util.List;

public class Arkanoid12 {
    private int width;
    private int height;
    public static Arkanoid12 game;

    private Ball12 ball;
    private Stand12 stand;
    private List<Brick12> bricks;

    public Arkanoid12(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball12 getBall() {
        return ball;
    }

    public void setBall(Ball12 ball) {
        this.ball = ball;
    }

    public Stand12 getStand() {
        return stand;
    }

    public void setStand(Stand12 stand) {
        this.stand = stand;
    }

    public List<Brick12> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick12> bricks) {
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
