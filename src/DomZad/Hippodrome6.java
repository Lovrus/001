package DomZad;
import java.util.ArrayList;
import java.util.List;

public class Hippodrome6 {
    static Hippodrome6 game;
    private List<Horse6> horses6;

    public Hippodrome6(List<Horse> horses6) {
        this.horses6 = horses6;
    }

    public List<Horse6> getHorses() {
        return horses6;
    }

    public static void main(String[] args) {
        ArrayList<Horse6> horses = new ArrayList<>();
        horses.add(new Horse6("Lucky", 3, 0));
        horses.add(new Horse6("Slevin", 3, 0));
        horses.add(new Horse6("Homer", 3, 0));
        game = new Hippodrome6(horses6);
    }
}