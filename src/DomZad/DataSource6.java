package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource6 {
    private static DataSource6 ourInstance = new DataSource6();

    public static DataSource6 getInstance() {
        return ourInstance;
    }

    private DataSource6() {
    }

    private List<User7> users = new LinkedList<User7>() {{
        add(new User7("Ivanov", 123l, 1));
        add(new User7("Petrov", 124l, 2));
        add(new User7("Petrov", 125l, 1));
        add(new User7("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User7> getUsers() {
        return users;
    }

    public User7 createOrUpdate(User7 newUser) {
        if (newUser == User7.NULL_USER)
            return User7.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User7 createNewUser(User7 newUser) {
        User7 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User7 updateUser(User7 newUser) {
        for (User7 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User7.NULL_USER;
    }
}