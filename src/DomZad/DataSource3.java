package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource3 {
    private static DataSource3 ourInstance = new DataSource3();

    public static DataSource3 getInstance() {
        return ourInstance;
    }

    private DataSource3() {
    }

    private List<User5> users = new LinkedList<User5>() {{
        add(new User5("Ivanov", 123l, 1));
        add(new User5("Petrov", 124l, 2));
        add(new User5("Petrov", 125l, 1));
        add(new User5("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User5> getUsers() {
        return users;
    }

    public User5 createOrUpdate(User5 newUser) {
        if (newUser == User5.NULL_USER)
            return User5.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User5 createNewUser(User5 newUser) {
        User5 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User5 updateUser(User5 newUser) {
        for (User5 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User5.NULL_USER;
    }
}