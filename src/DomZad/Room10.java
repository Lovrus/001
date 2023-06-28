package DomZad;

public class Room10 {
    private int width;
    private int height;
    private Snake10 snake;
    private Mouse10 mouse;
    public static Room10 game;

    public Room10(int width, int height, Snake10 snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Snake10 getSnake() {
        return snake;
    }

    public void setSnake(Snake10 snake) {
        this.snake = snake;
    }

    public Mouse10 getMouse() {
        return mouse;
    }

    public void setMouse(Mouse10 mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        game = new Room10(20, 20, new Snake10(10, 10));
        game.snake.setDirection(SnakeDirection10.DOWN);
    }

    void run() {
    }

    void print() {

    }

}
