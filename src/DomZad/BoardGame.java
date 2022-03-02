package DomZad;

// JR_8_2_2
public class BoardGame {
    String name;

    public BoardGame() {
    }

    public BoardGame(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
