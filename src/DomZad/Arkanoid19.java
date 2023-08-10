package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Arkanoid19 {
    private int width;
    private int height;
    public static Arkanoid19 game;
    private boolean isGameOver;

    private Ball19 ball;
    private Stand19 stand;
    private List<Brick19> bricks;

    public Arkanoid19(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Ball19 getBall() {
        return ball;
    }

    public void setBall(Ball19 ball) {
        this.ball = ball;
    }

    public Stand19 getStand() {
        return stand;
    }

    public void setStand(Stand19 stand) {
        this.stand = stand;
    }

    public List<Brick19> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick19> bricks) {
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

    void draw(Canvas19 canvas) {
        //draw bricks
        for (Brick19 brick : bricks) {
            brick.draw(canvas);
        }

        //draw ball
        ball.draw(canvas);

        //draw stand
        stand.draw(canvas);
    }

    public void checkStandBump() {
        if (ball.intersects(stand)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    public void checkEndGame() {
        if (ball.getY() > height)
            isGameOver = true;
    }

    public void checkBricksBump() {
        for (Brick19 brick : new ArrayList<Brick19>(bricks)) {
            if (ball.intersects(brick)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);

                bricks.remove(brick);
            }
        }
    }

    public static void main(String[] args) {

    }
}
