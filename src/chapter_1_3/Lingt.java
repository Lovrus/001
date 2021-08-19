package chapter_1_3;

public class Lingt {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;
        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;
        days = 1000; // указать количество дней
        seconds = days * 24 * 60 * 60;
        // преобразовать в секунды
        distance = lightspeed * seconds;
        // вычислить расстояние
        System.out.print("За " + days);
        System.out.print(" дней све пройдет около ");
        System.out.println(distance + " миль.");
    }
}
