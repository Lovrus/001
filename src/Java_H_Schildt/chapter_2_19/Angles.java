package Java_H_Schildt.chapter_2_19;

// Демонстрация работы toDegress() и toRadians().
public class Angles {
    public static void main(String[] args) {
        double theta = 120.0;
        System.out.println(theta + " градусов равно " +
                Math.toRadians(theta) + "радиан. ");
        theta = 1.312;
        System.out.println(theta + " радиан равно " +
                Math.toDegrees(theta) + " градусов. ");
    }
}
