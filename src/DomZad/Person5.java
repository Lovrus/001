package DomZad;

import java.util.Date;

public class Person5 {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person5(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}
