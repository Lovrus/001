package DomZad;

import java.util.ArrayList;
import java.util.List;

public class Snake12 {
    private List<SnakeSection12> sections;
    private boolean isAlive;
    private SnakeDirection12 direction;

    public Snake12(int x, int y) {
        sections = new ArrayList<SnakeSection12>();
        sections.add(new SnakeSection12(x, y));
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void setDirection(SnakeDirection12 direction) {
        this.direction = direction;
    }

    public List<SnakeSection12> getSections() {

        return sections;
    }

    public void move() {

    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection12 getDirection() {
        return direction;
    }
}
