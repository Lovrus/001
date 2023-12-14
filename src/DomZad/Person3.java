package DomZad;
import java.util.Date;

public class Person3 {
    private String name3;
    private Sex sex;
    private Date birthDate;

    private Person3(String name3, Sex sex, Date birthDate) {
        this.name3 = name3;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person3 createMale(String name3, Date birthDate) {
        return new Person3(name3, Sex.MALE, birthDate);
    }

    public static Person3 createFemale(String name3, Date birthDate) {
        return new Person3(name3, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name3;
    }

    public void setName(String name3) {
        this.name3 = name3;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
