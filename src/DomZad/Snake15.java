package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Snake15 {
    private List<SnakeSection15> sections;
    private boolean isAlive;
    private SnakeDirection15 direction;

    public Snake15(int x, int y) {
        sections = new ArrayList<SnakeSection15>();
        sections.add(new SnakeSection15(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection15 direction) {
        this.direction = direction;
    }

    public List<SnakeSection15> getSections() {

        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection15 getDirection() {
        return direction;
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move() {
        if (!isAlive) return;

        if (direction == SnakeDirection15.UP)
            move(0, -1);
        else if (direction == SnakeDirection15.RIGHT)
            move(1, 0);
        else if (direction == SnakeDirection15.DOWN)
            move(0, 1);
        else if (direction == SnakeDirection15.LEFT)
            move(-1, 0);
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    void move(int dx, int dy) {

    }
}