package DomZad;
/*
Затенение поля класса
*/

public class JR_11_6_4 {
    public static int salary;

    public static void add(int increase) {
      //  int salary = JR_11_6_4.salary;
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
