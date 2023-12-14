package DomZad;
public class User9 implements Cloneable {
    private String name;
    private final long id;
    private int level;

    public static final User9 NULL_USER = new User9();

    public User9(String name, long id, int level) {
        this.name = name;
        this.id = id;
        this.level = level;
    }

    public User9() {
        this("", 0, 0);
    }


    //methods with logic
    public boolean isNew() {
        return id == 0;
    }

    public User9 clone() {
        try {
            return (User9) super.clone();
        } catch (CloneNotSupportedException ignored) {
            return NULL_USER;
        }
    }

    public User9 clone(long newId) {
        if (this == NULL_USER) return NULL_USER;

        return new User9(name, newId, level);
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