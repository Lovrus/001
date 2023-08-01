package DomZad;

import java.util.List;

public class Arkanoid13 {
    private int width;
    private int height;
    public static Arkanoid13 game;

    private Ball13 ball;
    private Stand13 stand;
    private List<Brick13> bricks;

    public Arkanoid13(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball13 getBall() {
        return ball;
    }

    public void setBall(Ball13 ball) {
        this.ball = ball;
    }

    public Stand13 getStand() {
        return stand;
    }

    public void setStand(Stand13 stand) {
        this.stand = stand;
    }

    public List<Brick13> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick13> bricks) {
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
