package DomZad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
User, Loser, Coder and Proger
*/

public class JR_20_6_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person2 persons = null;
        //read values from keyboard here
        String key;
        while (true) {
            key = reader.readLine();
            boolean u = key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger");
            if (!u) break;

            switch (key) {
                case "user":
                    persons = new Person2.User();
                    break;
                case "loser":
                    persons = new Person2.Loser();
                    break;
                case "coder":
                    persons = new Person2.Coder();
                    break;
                case "proger":
                    persons = new Person2.Proger();
                    break;
            }
            doWork(persons);
        }
    }

    public static void doWork(Person2 persons) {
        if (persons instanceof Person2.User) {
            Person2.User user = (Person2.User) persons;
            user.live();
        } else if (persons instanceof Person2.Loser) {
            Person2.Loser loser = (Person2.Loser) persons;
            loser.doNothing();
        } else if (persons instanceof Person2.Coder) {
            Person2.Coder coder = (Person2.Coder) persons;
            coder.writeCode();
        } else if (persons instanceof Person2.Proger) {
            Person2.Proger proger = (Person2.Proger) persons;
            proger.enjoy();
        }
    }
}
