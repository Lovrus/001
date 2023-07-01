package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Snake13 {
    private List<SnakeSection13> sections;
    private boolean isAlive;
    private SnakeDirection13 direction;

    public Snake13(int x, int y) {
        sections = new ArrayList<SnakeSection13>();
        sections.add(new SnakeSection13(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection13 direction) {
        this.direction = direction;
    }

    public List<SnakeSection13> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection13 getDirection() {
        return direction;
    }
}
