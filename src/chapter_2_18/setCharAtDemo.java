package chapter_2_18;

// Демонстрация работы методов charAt() и setCharAt().
public class setCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Буфер до = " + sb);
        System.out.println("charAt(1) до = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("Буфер после = " + sb);
        System.out.println("charAt(1) после = " + sb.charAt(1));
    }
}