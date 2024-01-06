package DomZad;
public class User10 implements Cloneable {
    private String name;
    private final long id;
    private int level;

    public static final User10 NULL_USER = new User10();

    public User10(String name, long id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public User10() {
        this("", 0, 0);
    }


    //methods with logic
    public boolean isNew() {
        return id == 0;
    }

    public User10 clone() {
        try {
            return (User10) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_USER;
        }
    }

    public User10 clone(long newId) {
        if (this == NULL_USER) return NULL_USER;

        return new User10(name, newId, level);
    }

    /////  getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", level=" + level +
                '}';
    }
}