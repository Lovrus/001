package DomZad;
/*
Обрати внимание, как именно Mouse отличается от Dog
Этот класс - привычный для нас.
*/

public class Mouse20 implements Pet3, Sayable2 {
    @Override
    public Sayable2 toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Мышь пищит.";
    }
}