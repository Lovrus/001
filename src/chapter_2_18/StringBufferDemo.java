package chapter_2_18;

// Работа с длиной и емкостью StringBuffer.
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Буфер = " + sb);
        System.out.println("Длина = " + sb.length());
        System.out.println("Емкость = " + sb.capacity());
    }
}
