package DomZad;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс змея
 */
public class Snake17 {
    //Направление движения змеи
    private SnakeDirection17 direction;
    //Состояние - жива змея или нет.
    private boolean isAlive;
    //Список кусочков змеи.
    private List<SnakeSection17> sections;

    public Snake17(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection17(x, y));
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

    public SnakeDirection17 getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection17 direction) {
        this.direction = direction;
    }

    public List<SnakeSection17> getSections() {
        return sections;
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move() {
        if (!isAlive) return;

        if (direction == SnakeDirection17.UP)
            move(0, -1);
        else if (direction == SnakeDirection17.RIGHT)
            move(1, 0);
        else if (direction == SnakeDirection17.DOWN)
            move(0, 1);
        else if (direction == SnakeDirection17.LEFT)
            move(-1, 0);
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    void move(int dx, int dy) {
        //Создаем новую голову - новый "кусочек змеи".
        SnakeSection17 head = sections.get(0);
        head = new SnakeSection17(head.getX() + dx, head.getY() + dy);

        //Проверяем - не вылезла ли голова за границу комнаты
        checkBorders(head);
        if (!isAlive) return;

        //Проверяем - не пересекает ли змея  саму себя
        checkBody(head);
        if (!isAlive) return;

        //Проверяем - не съела ли змея мышь.
        Mouse17 mouse = Room17.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()) //съела
        {
            sections.add(0, head);                  //Добавили новую голову
            Room17.game.eatMouse();                   //Хвост не удаляем, но создаем новую мышь.
        } else //просто движется
        {
            sections.add(0, head);                  //добавили новую голову
            sections.remove(sections.size() - 1);   //удалили последний элемент с хвоста
        }
    }

    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    void checkBorders(SnakeSection17 head) {
        if ((head.getX() < 0 || head.getX() >= Room17.game.getWidth()) || head.getY() < 0 || head.getY() >= Room17.game.getHeight()) {
            isAlive = false;
        }
    }

    /**
     * Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    void checkBody(SnakeSection17 head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}