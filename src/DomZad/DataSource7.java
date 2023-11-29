package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource7 {
    private static DataSource7 ourInstance = new DataSource7();

    public static DataSource7 getInstance() {
        return ourInstance;
    }

    private DataSource7() {
    }

    private List<User8> users = new LinkedList<User8>() {{
        add(new User8("Ivanov", 123l, 1));
        add(new User8("Petrov", 124l, 2));
        add(new User8("Petrov", 125l, 1));
        add(new User8("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User8> getUsers() {
        return users;
    }

    public User8 createOrUpdate(User8 newUser) {
        if (newUser == User8.NULL_USER)
            return User8.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User8 createNewUser(User8 newUser) {
        User8 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User8 updateUser(User8 newUser) {
        for (User8 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User8.NULL_USER;
    }
}