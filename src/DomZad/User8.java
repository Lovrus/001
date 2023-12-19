package DomZad;
public class User8 implements Cloneable {
    private String name;
    private final long id;
    private int level;

    public static final User8 NULL_USER = new User8();

    public User8(String name, long id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public User8() {
        this("", 0, 0);
    }


    //methods with logic
    public boolean isNew() {
        return id == 0;
    }

    public User8 clone() {
        try {
            return (User8) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_USER;
        }
    }

    public User8 clone(long newId) {
        if (this == NULL_USER) return NULL_USER;

        return new User8(name, newId, level);
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