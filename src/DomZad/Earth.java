package DomZad;

public class Earth implements Planet{
    private static volatile Earth instance = null;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Earth();
                }
            }
        }
        return instance;
    }
}
