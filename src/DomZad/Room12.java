package DomZad;
/**
 * Основной класс программы.
 */
public class Room12 {
    private int width;
    private int height;
    private Snake12 snake;
    private Mouse12 mouse;

    public Room12(int width, int height, Snake12 snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public Snake12 getSnake() {
        return snake;
    }

    public Mouse12 getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake12 snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse12 mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() {

    }

    /**
     * Выводим на экран текущее состояние игры
     */
    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
    }

    /**
     * Метод вызывается, когда мышь съели
     */
    public void eatMouse() {
        createMouse();
    }

    /**
     * Создает новую мышь
     */
    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse12(x, y);
    }


    public static Room12 game;

    public static void main(String[] args) {
        game = new Room12(20, 20, new Snake12(10, 10));
        game.snake.setDirection(SnakeDirection12.DOWN);
        game.createMouse();
        game.run();
    }


    /**
     * Программа делает паузу, длинна которой зависит от длинны змеи.
     */
    public void sleep() {
    }
}