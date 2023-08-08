package DomZad;

import java.util.List;

public class Arkanoid18 {
    private int width;
    private int height;
    public static Arkanoid18 game;

    private Ball18 ball;
    private Stand18 stand;
    private List<Brick18> bricks;

    public Arkanoid18(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball18 getBall() {
        return ball;
    }

    public void setBall(Ball18 ball) {
        this.ball = ball;
    }

    public Stand18 getStand() {
        return stand;
    }

    public void setStand(Stand18 stand) {
        this.stand = stand;
    }

    public List<Brick18> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick18> bricks) {
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
        ball.move();
        stand.move();
    }

    void draw(Canvas18 canvas) {
        //draw bricks
        for (Brick18 brick : bricks) {
            brick.draw(canvas);
        }

        //draw ball
        ball.draw(canvas);

        //draw stand
        stand.draw(canvas);
    }

    public static void main(String[] args) {

    }
}
