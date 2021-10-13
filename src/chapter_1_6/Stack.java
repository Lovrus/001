package chapter_1_6;

// В этом классе определяется целочисленный стек, где
// можно хранить до 10 целочисленных значений
public class Stack {
    int stck[] = new int[10];
    int tos;

    // иницилизировать вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }
}