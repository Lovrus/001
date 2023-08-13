package DomZad;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Главный класс игры
 */
public class Arkanoid20 {
    //ширина и высота
    private int width;
    private int height;

    //список кирпичей
    private ArrayList<Brick20> bricks = new ArrayList<Brick20>();
    //шарик
    private Ball20 ball;
    //подставка
    private Stand20 stand;

    //игра закончена?
    private boolean isGameOver = false;

    public Arkanoid20(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public ArrayList<Brick20> getBricks() {
        return bricks;
    }

    public Ball20 getBall() {
        return ball;
    }

    public void setBall(Ball20 ball) {
        this.ball = ball;
    }

    public Stand20 getStand() {
        return stand;
    }

    public void setStand(Stand20 stand) {
        this.stand = stand;
    }

    /**
     * Рисуем на холсте границы и все объекты.
     */
    void draw(Canvas20 canvas) {
        drawBorders(canvas);

        //draw bricks
        for (Brick20 brick : bricks) {
            brick.draw(canvas);
        }

        //draw ball
        ball.draw(canvas);

        //draw stand
        stand.draw(canvas);

    }

    /**
     * Рисуем на холсте границы
     */
    private void drawBorders(Canvas20 canvas) {
        //draw game
        for (int i = 0; i < width + 2; i++) {
            for (int j = 0; j < height + 2; j++) {
                canvas.setPoint(i, j, '.');
            }
        }

        for (int i = 0; i < width + 2; i++) {
            canvas.setPoint(i, 0, '-');
            canvas.setPoint(i, height + 1, '-');
        }

        for (int i = 0; i < height + 2; i++) {
            canvas.setPoint(0, i, '|');
            canvas.setPoint(width + 1, i, '|');
        }
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    void run() throws Exception {
        //Создаем холст для отрисовки.
        Canvas20 canvas = new Canvas20(width, height);

        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //Исполняем цикл, пока игра не окончека
        while (!isGameOver) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    stand.moveLeft();
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    stand.moveRight();
                    //Если "пробел" - запускаем шарик
                else if (event.getKeyCode() == KeyEvent.VK_SPACE)
                    ball.start();
            }

            //двигаем все объекты
            move();

            //проверяем столкновения
            checkBricksBump();
            checkStandBump();

            //проверяем, что шарик мог улететь через дно.
            checkEndGame();

            //отрисовываем все объекты
            canvas.clear();
            draw(canvas);
            canvas.print();

            //пауза
            Thread.sleep(300);
        }

        //Выводим сообщение "Game Over"
        System.out.println("Game Over!");
    }

    /**
     * Двигаем шарик и подставку.
     */
    public void move() {
        ball.move();
        stand.move();
    }

    /**
     * Проверяем столкновение с кирпичами.
     * Если столкновение было - шарик отлетает в случайном направлении 0..360 градусов
     */
    void checkBricksBump() {
        for (Brick20 brick : new ArrayList<Brick20>(bricks)) {
            if (ball.intersects(brick)) {
                double angle = Math.random() * 360;
                ball.setDirection(angle);

                bricks.remove(brick);
            }
        }
    }
    /**
     * Проверяем столкновение с подставкой.
     * Если столкновение было - шарик отлетает в случайном направлении  вверх 80..100 градусов.
     */
    void checkStandBump() {
        if (ball.intersects(stand)) {
            double angle = 90 + 20 * (Math.random() - 0.5);
            ball.setDirection(angle);
        }
    }

    /**
     * Проверяем - не улетел ли шарик через дно.
     * Если да - игра окончена (isGameOver = true)
     */
    void checkEndGame() {
        if (ball.getY() > height && ball.getDy() > 0)
            isGameOver = true;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static Arkanoid20 game;

    public static void main(String[] args) throws Exception {
        game = new Arkanoid20(20, 30);

        Ball20 ball = new Ball20(10, 29, 2, 95);
        game.setBall(ball);

        Stand20 stand = new Stand20(10, 30);
        game.setStand(stand);

        game.getBricks().add(new Brick20(3, 3));
        game.getBricks().add(new Brick20(7, 5));
        game.getBricks().add(new Brick20(12, 5));
        game.getBricks().add(new Brick20(16, 3));

        game.run();
    }
}

