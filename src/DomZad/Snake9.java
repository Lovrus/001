package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Snake9 {
    private List<SnakeSection9> sections;
    private boolean isAlive;
    private SnakeDirection9 direction;

    public Snake9(int x, int y) {
        sections = new ArrayList<SnakeSection9>();
        sections.add(new SnakeSection9(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection9(SnakeDirection9 direction) {
        this.direction = direction;
    }

    public List<SnakeSection9> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection9 getDirection() {
        return direction;
    }
}