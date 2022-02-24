package DomZad;
/*
Добро пожаловать! Но не всем.
*/
public class JR_7_3_1 {

    public static void main(String[] args) {

    }

    public static void signIn(String username){
        //напишите тут ваш код
        if (username == "user") {
            return;
        } else {
            System.out.println("Добро пожаловать " + username);
            System.out.println("Очень скучали по Вам, " + username);
        }
    }
}


