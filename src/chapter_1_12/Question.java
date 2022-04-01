package chapter_1_12;
// Усовершенствованная версия программы принятия
// решений из главы 9. В этой версии для представления
// возможных ответов используется перечисление,
// а не переменные экземпляра

import java.util.Random;

// Перечисление возможных ответов
enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

public class Question {
    Random rand = new Random();

    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());

        if (prob < 15)
            return Answers.MAYBE; // 15%
        else if (prob < 30)
            return Answers.NO; // 15%
        else if (prob < 60)
            return Answers.YES; // 30%
        else if (prob < 75)
            return Answers.LATER; // 15%
        else if (prob < 98)
            return Answers.SOON; // 13%
        else
            return Answers.NEVER; // 2%
    }
}

class AskMe {
    static void amswer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позднее");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        amswer(q.ask());
        amswer(q.ask());
        amswer(q.ask());
        amswer(q.ask());
    }
}
