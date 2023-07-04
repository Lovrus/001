package DomZad;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс змея
 */
public class Snake16 {
    //Направление движения змеи
    private SnakeDirection16_1 direction;
    //Состояние - жива змея или нет.
    private boolean isAlive;
    //Список кусочков змеи.
    private List<SnakeSection16> sections;

    public Snake16(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection16(x, y));
        isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public SnakeDirection16_1 getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection16_1 direction) {
        this.direction = direction;
    }

    public List<SnakeSection16> getSections() {
        return sections;
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move() {
        if (!isAlive) return;

        if (direction == SnakeDirection16_1.UP)
            move(0, -1);
        else if (direction == SnakeDirection16_1.RIGHT)
            move(1, 0);
        else if (direction == SnakeDirection16_1.DOWN)
            move(0, 1);
        else if (direction == SnakeDirection16_1.LEFT)
            move(-1, 0);
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    private void move(int dx, int dy) {
    }

    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    void checkBorders(SnakeSection16 head) {
        if ((head.getX() < 0 || head.getX() >= Room16.game.getWidth()) || head.getY() < 0 || head.getY() >= Room16.game.getHeight()) {
            isAlive = false;
        }
    }

    /**
     * Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    void checkBody(SnakeSection16 head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}