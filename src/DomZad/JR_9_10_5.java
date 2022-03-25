package DomZad;
/*
Мама мыла раму
*/
public class JR_9_10_5 {

    public static void main(String[] args) {
        String s1 = "Мама";
        String s2 = "Мыла";
        String s3 = "Раму";

        System.out.printf("%s%s%s%n", s1, s2, s3);
        System.out.printf("%s%s%s%n", s1, s3, s2);
        System.out.printf("%s%s%s%n", s2, s1, s3);
        System.out.printf("%s%s%s%n", s2, s3, s1);
        System.out.printf("%s%s%s%n", s3, s1, s2);
        System.out.printf("%s%s%s%n", s3, s2, s1);
    }
}

