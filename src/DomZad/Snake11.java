package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Snake11 {
    private List<SnakeSection11> sections;
    private boolean isAlive;
    private SnakeDirection11 direction;

    public Snake11(int x, int y) {
        sections = new ArrayList<SnakeSection11>();
        sections.add(new SnakeSection11(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection11 direction) {
        this.direction = direction;
    }

    public List<SnakeSection11> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection11 getDirection() {
        return direction;
    }
}