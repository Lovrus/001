package DomZad;

import java.util.LinkedList;
import java.util.List;

public class DataSource {
    private static DataSource ourInstance = new DataSource();

    public static DataSource getInstance() {
        return ourInstance;
    }

    private DataSource() {
    }

    private List<User3> users = new LinkedList<User3>() {{
        add(new User3("Ivanov", 123l, 1));
        add(new User3("Petrov", 124l, 2));
        add(new User3("Petrov", 125l, 1));
        add(new User3("Sidorov", 126l, 2));
    }};

    private long maxUserId = 126l;

    public List<User3> getUsers() {
        return users;
    }

    public User3 createOrUpdate(User3 newUser) {
        if (newUser == User3.NULL_USER)
            return User3.NULL_USER;

        //new User
        if (newUser.getId() == 0)
            return createNewUser(newUser);
        else
            return updateUser(newUser);
    }

    private User3 createNewUser(User3 newUser) {
        User3 clone = newUser.clone(++maxUserId);
        users.add(clone);
        return clone;
    }

    private User3 updateUser(User3 newUser) {
        for (User3 user : users) {
            if (user.getId() == newUser.getId()) {
                user.setName(newUser.getName());
                user.setLevel(newUser.getLevel());
                return user;
            }
        }
        //if we didn't find such a user
        return User3.NULL_USER;
    }
}
