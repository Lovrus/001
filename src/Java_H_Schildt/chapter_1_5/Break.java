package Java_H_Schildt.chapter_1_5;

//Применение оператора break в качестве цивилизованной
// формы оператора goto
public class Break {
    public static void main(String[] args) {
        boolean t = true;

        first:
        {
            second:
            {
                third:
                {
                    System.out.println(
                            "Предшествует оператору break.");
                    if (t) break second;// выход из блока second
                    System.out.println(
                            "Этот оператор не будет выполняться");
                }
                System.out.println(
                        "Этот оператор не будет выполняться");
            }
            System.out.println(
                    "Этот оператор следует за блоком second.");
        }
    }
}
