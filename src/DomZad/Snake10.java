package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Snake10 {
    private List<SnakeSection10> sections;
    private boolean isAlive;
    private SnakeDirection10 direction;

    public Snake10(int x, int y) {
        sections = new ArrayList<SnakeSection10>();
        sections.add(new SnakeSection10(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection10 direction) {
        this.direction = direction;
    }

    public List<SnakeSection10> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection10 getDirection() {
        return direction;
    }
}