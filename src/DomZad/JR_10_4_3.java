package DomZad;

/*
Собираем прямоугольник
*/
public class JR_10_4_3 {
    //напишите тут ваш код
    public int left;
    public int top;
    public int width;
    public int height;

    public void initialize(int left) {
        this.left = left;
    }

    public void initialize(int left, int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize (int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize (int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}

