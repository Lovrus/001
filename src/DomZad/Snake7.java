package DomZad;
import java.util.List;

public class Snake7 {
    private List<SnakeSection7> sections;
    private boolean isAlive;
    private SnakeDirection7 direction;

    public void setDirection(SnakeDirection7 direction) {
        this.direction = direction;
    }

    public List<SnakeSection7> getSections() {

        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection7 getDirection() {
        return direction;
    }
}