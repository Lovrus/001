package DomZad;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс змея
 */
public class Snake18 {
    //Направление движения змеи
    private SnakeDirection18 direction;
    //Состояние - жива змея или нет.
    private boolean isAlive;
    //Список кусочков змеи.
    private List<SnakeSection18> sections;

    public Snake18(int x, int y) {
        sections = new ArrayList<>();
        sections.add(new SnakeSection18(x, y));
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

    public SnakeDirection18 getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection18 direction) {
        this.direction = direction;
    }

    public List<SnakeSection18> getSections() {
        return sections;
    }

    /**
     * Метод перемещает змею на один ход.
     * Направление перемещения задано переменной direction.
     */
    public void move() {
        if (!isAlive) return;

        if (direction == SnakeDirection18.UP)
            move(0, -1);
        else if (direction == SnakeDirection18.RIGHT)
            move(1, 0);
        else if (direction == SnakeDirection18.DOWN)
            move(0, 1);
        else if (direction == SnakeDirection18.LEFT)
            move(-1, 0);
    }

    /**
     * Метод перемещает змею в соседнюю клетку.
     * Координаты клетки заданы относительно текущей головы с помощью переменных (dx, dy).
     */
    void move(int dx, int dy) {
        //Создаем новую голову - новый "кусочек змеи".
        SnakeSection18 head = sections.get(0);
        head = new SnakeSection18(head.getX() + dx, head.getY() + dy);

        //Проверяем - не вылезла ли голова за границу комнаты
        checkBorders(head);
        if (!isAlive) return;

        //Проверяем - не пересекает ли змея  саму себя
        checkBody(head);
        if (!isAlive) return;

        //Проверяем - не съела ли змея мышь.
        Mouse18 mouse = Room18.game.getMouse();
        if (head.getX() == mouse.getX() && head.getY() == mouse.getY()) //съела
        {
            sections.add(0, head);                  //Добавили новую голову
            Room18.game.eatMouse();                   //Хвост не удаляем, но создаем новую мышь.
        } else //просто движется
        {
            sections.add(0, head);                  //добавили новую голову
            sections.remove(sections.size() - 1);   //удалили последний элемент с хвоста
        }
    }

    /**
     * Метод проверяет - находится ли новая голова в пределах комнаты
     */
    private void checkBorders(SnakeSection18 head) {
        if ((head.getX() < 0 || head.getX() >= Room18.game.getWidth()) || head.getY() < 0 || head.getY() >= Room18.game.getHeight()) {
            isAlive = false;
        }
    }

    /**
     * Метод проверяет - не совпадает ли голова с каким-нибудь участком тела змеи.
     */
    private void checkBody(SnakeSection18 head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}
