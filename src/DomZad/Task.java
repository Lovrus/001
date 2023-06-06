package DomZad;

public class Task implements Runnable {
    private String initialString;
    private JR_29_05_01 solution;

    public Task(JR_29_05_01 solution, String initialString) {
        this.solution = solution;
        this.initialString = initialString;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        String str = this.initialString;
        do {
            System.out.println(name + str);
        } while ((str = solution.getPartOfString(str, name)) != null || !str.isEmpty());
    }
}
