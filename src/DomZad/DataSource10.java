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

    private List<User11> users = new LinkedList<User11>() {{
        add(new User11("Ivanov", 123l, 1));
        add(new User11("Petrov", 124l, 2));
        add(new User11("Petrov", 125l, 1));
        add(new User11("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User11> getUsers() {
        return users;
    }

    public User11 createOrUpdate(User11 newUser) {
        if (newUser == User11.NULL_USER)
            return User11.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User11 createNewUser(User11 newUser) {
        User11 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User11 updateUser(User11 newUser) {
        for (User11 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User11.NULL_USER;
    }
}