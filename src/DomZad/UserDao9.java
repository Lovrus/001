package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao9 {
    private DataSource10 dataSource = DataSource10.getInstance();

    public User10 getUserById(long id) {
        List<User10> users = dataSource.getUsers();
        for (User10 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User10.NULL_USER;
    }

    public List<User10> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User10> users = dataSource.getUsers();
        List<User10> result = new ArrayList<>();
        for (User10 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User10> getAllUsers() {
        List<User10> users = dataSource.getUsers();
        List<User10> result = new ArrayList<>();
        for (User10 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User10> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User10> users = dataSource.getUsers();
        List<User10> result = new ArrayList<>();

        for (User10 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User10> result, User10 user) {
        User10 clone = user.clone();

        //skip bad users
        if (clone != User10.NULL_USER) {
            result.add(clone);
        }
    }

    public User10 createOrUpdate(User10 user) {
        return dataSource.createOrUpdate(user);
    }

    public User10 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User10> users = dataSource.getUsers();
        for (User10 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User10.NULL_USER;
    }
}
