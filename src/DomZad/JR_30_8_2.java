package DomZad;
/*
Напряги извилины!
*/

public class JR_30_8_2 {
    private String name;

    JR_30_8_2(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    private void sout() {
        new JR_30_8_2("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new JR_30_8_2("Риша").sout();
    }
}
