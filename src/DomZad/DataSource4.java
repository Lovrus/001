package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource4 {
    private static DataSource4 ourInstance = new DataSource4();

    public static DataSource4 getInstance() {
        return ourInstance;
    }

    private DataSource4() {
    }

    private List<User6> users = new LinkedList<User6>() {{
        add(new User6("Ivanov", 123l, 1));
        add(new User6("Petrov", 124l, 2));
        add(new User6("Petrov", 125l, 1));
        add(new User6("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User6> getUsers() {
        return users;
    }

    public User6 createOrUpdate(User6 newUser) {
        if (newUser == User6.NULL_USER)
            return User6.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User6 createNewUser(User6 newUser) {
        User6 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User6 updateUser(User6 newUser) {
        for (User6 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User6.NULL_USER;
    }
}