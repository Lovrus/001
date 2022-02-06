package DomZad;

public class JR_3_5_2 {
    private static int catsCount = 0;

    public static void addNewCat() {
        catsCount = catsCount + 1;

    }

    public static void main(String[] args) {
        addNewCat();
        addNewCat();
        addNewCat();

        System.out.println(catsCount);

    }
}
