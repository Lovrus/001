package DomZad;
//JR_3_5_3
public class JR_Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        JR_Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {
        System.out.println(catsCount);
    }
}
