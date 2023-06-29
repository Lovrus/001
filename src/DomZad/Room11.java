package DomZad;
public class Room11 {
    private int width;
    private int height;
    private Snake11 snake;
    private Mouse11 mouse;
    public static Room11 game;

    public Room11(int width, int height, Snake11 snake) {
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

    public Snake11 getSnake() {
        return snake;
    }

    public void setSnake(Snake11 snake) {
        this.snake = snake;
    }

    public Mouse11 getMouse() {
        return mouse;
    }

    public void setMouse(Mouse11 mouse) {
        this.mouse = mouse;
    }

    public static void main(String[] args) {
        game = new Room11(20, 20, new Snake11(10, 10));
        game.snake.setDirection(SnakeDirection11.DOWN);
    }

    void run() {
    }

    void print() {

    }

    void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse11(x, y);
    }

    public void eatMouse() {
        createMouse();
    }

}