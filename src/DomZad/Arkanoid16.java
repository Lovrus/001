package DomZad;

import java.util.List;

public class Arkanoid16 {
    private int width;
    private int height;
    public static Arkanoid16 game;

    private Ball16 ball;
    private Stand16 stand;
    private List<Brick16> bricks;

    public Arkanoid16(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball16 getBall() {
        return ball;
    }

    public void setBall(Ball16 ball) {
        this.ball = ball;
    }

    public Stand16 getStand() {
        return stand;
    }

    public void setStand(Stand16 stand) {
        this.stand = stand;
    }

    public List<Brick16> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick16> bricks) {
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
