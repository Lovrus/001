package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Snake14 {
    private List<SnakeSection14> sections;
    private boolean isAlive;
    private SnakeDirection14 direction;

    public Snake14(int x, int y) {
        sections = new ArrayList<SnakeSection14>();
        sections.add(new SnakeSection14(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection14 direction) {
        this.direction = direction;
    }

    public List<SnakeSection14> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection14 getDirection() {
        return direction;
    }
}