package DomZad;

/*
Инициализация объектов
*/
public class JR_10_4_4 {

    public static void main(String[] args) {
        //напишите тут ваш код
        Person person = new Person();
        person.initialize("Иван", 15);
    }

    static class Person {
        //напишите тут ваш код
        public String name;
        public int age;

        public void initialize(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}

