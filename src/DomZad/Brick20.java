package DomZad;

/**
 * Класс для объекта "кирпич".
 */
public class Brick20 extends BaseObject20 {
    //картинка для отрисовки
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0},
            {0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
    };

    public Brick20(double x, double y) {
        super(x, y, 3);
    }

    /**
     * Рисуем себя на холсте
     */
    @Override
    void draw(Canvas20 canvas) {
        canvas.drawMatrix(x - radius + 1, y, matrix, 'H');
    }

    /**
     * Ничего не делаем - кирпич неподвижен
     */
    @Override
    void move() {
        //do nothing
    }
}
