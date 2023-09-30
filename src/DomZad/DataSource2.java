package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource2 {
    private static DataSource2 ourInstance = new DataSource2();

    public static DataSource2 getInstance() {
        return ourInstance;
    }

    private DataSource2() {
    }

    private List<User4> users = new LinkedList<User4>() {{
        add(new User4("Ivanov", 123l, 1));
        add(new User4("Petrov", 124l, 2));
        add(new User4("Petrov", 125l, 1));
        add(new User4("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User4> getUsers() {
        return users;
    }

    public User4 createOrUpdate(User4 newUser) {
        if (newUser == User4.NULL_USER)
            return User4.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User4 createNewUser(User4 newUser) {
        User4 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User4 updateUser(User4 newUser) {
        for (User4 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User4.NULL_USER;
    }
}