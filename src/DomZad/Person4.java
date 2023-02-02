package DomZad;
import java.util.Date;

public class Person4 {
    private String name;
    private Sex2 sex;
    private Date birthDate;

    private Person4(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person4 createMale(String name, Date birthDate) {
        return new Person4(name, Sex2.MALE, birthDate);
    }

    public static Person4 createFemale(String name, Date birthDate) {
        return new Person4(name, Sex2.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex2 getSex() {
        return sex;
    }

    public void setSex(Sex2 sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
