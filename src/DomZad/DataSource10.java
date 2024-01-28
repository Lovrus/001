package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource10 {
    private static DataSource10 ourInstance = new DataSource10();

    public static DataSource10 getInstance() {
        return ourInstance;
    }

    private DataSource10() {
    }

    private List<User10> users = new LinkedList<User10>() {{
        add(new User10("Ivanov", 123l, 1));
        add(new User10("Petrov", 124l, 2));
        add(new User10("Petrov", 125l, 1));
        add(new User10("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User10> getUsers() {
        return users;
    }

    public User10 createOrUpdate(User10 newUser) {
        if (newUser == User10.NULL_USER)
            return User10.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User10 createNewUser(User10 newUser) {
        User10 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User10 updateUser(User10 newUser) {
        for (User10 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User10.NULL_USER;
    }
}