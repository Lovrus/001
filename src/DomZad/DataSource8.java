package DomZad;
import java.util.LinkedList;
import java.util.List;

public class DataSource8 {
    private static DataSource8 ourInstance = new DataSource8();

    public static DataSource8 getInstance() {
        return ourInstance;
    }

    private DataSource8() {
    }

    private List<User9> users = new LinkedList<User9>() {{
        add(new User9("Ivanov", 123l, 1));
        add(new User9("Petrov", 124l, 2));
        add(new User9("Petrov", 125l, 1));
        add(new User9("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User9> getUsers() {
        return users;
    }

    public User9 createOrUpdate(User9 newUser) {
        if (newUser == User9.NULL_USER)
            return User9.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User9 createNewUser(User9 newUser) {
        User9 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User9 updateUser(User9 newUser) {
        for (User9 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User9.NULL_USER;
    }
}