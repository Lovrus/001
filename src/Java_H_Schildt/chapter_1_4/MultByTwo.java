package Java_H_Schildt.chapter_1_4;

// Применение сдвига влево в качестве
// быстрого способа умножения на 2
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}