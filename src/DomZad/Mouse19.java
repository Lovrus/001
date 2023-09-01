package DomZad;
public class Mouse19 implements Pet2, Sayable {
    @Override
    public Sayable toSayable(int i) {
        return this;
    }

    @Override
    public String say() {
        return "Мышь пищит.";
    }
}