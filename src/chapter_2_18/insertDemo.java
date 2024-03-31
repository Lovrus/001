package chapter_2_18;

// Демонстрация использования штыуке().
public class insertDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Мне Java!");
        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
