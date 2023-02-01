package DomZad;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class JR_24_9_1 {
    public static List<Person3> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person3.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person3.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1) {
            throw new RuntimeException();
        }

        Date birthdayDate;
        Person3 person;
        switch (args[0]) {
            case "-c":
                birthdayDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("м")) {
                    person = Person3.createMale(args[1], birthdayDate);
                } else {
                    person = Person3.createFemale(args[1], birthdayDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-r":
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null) {
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                }
                break;
            case "-u":
                birthdayDate = simpleDateFormat.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if (person == null) {
                    throw new IllegalArgumentException();
                }
                person.setSex(getSex(args[3]));
                person.setBirthDate(birthdayDate);
                person.setName(args[2]);
                allPeople.set(id, person);
                break;
            case "-d":
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));
                currentPerson3.setName(null);
                currentPerson3.setSex(null);
                currentPerson3.setBirthDate(null);
                break;
        }

    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}
