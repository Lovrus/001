package DomZad;
/*
Расстояние между двумя точками
*/

public class JR_11_4_7 {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {

    }
}
