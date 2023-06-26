package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Snake8 {
    private List<SnakeSection8> sections;
    private boolean isAlive;
    private SnakeDirection8 direction;

    public Snake8(int x, int y) {
        sections = new ArrayList<SnakeSection8>();
        sections.add(new SnakeSection8(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection8 direction) {
        this.direction = direction;
    }

    public List<SnakeSection8> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection8 getDirection() {
        return direction;
    }
}