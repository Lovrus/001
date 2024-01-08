package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao9 {
    private DataSource10 dataSource = DataSource10.getInstance();

    public User11 getUserById(long id) {
        List<User11> users = dataSource.getUsers();
        for (User11 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User11.NULL_USER;
    }

    public List<User11> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User11> users = dataSource.getUsers();
        List<User11> result = new ArrayList<>();
        for (User11 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User11> getAllUsers() {
        List<User11> users = dataSource.getUsers();
        List<User11> result = new ArrayList<>();
        for (User11 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User11> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User11> users = dataSource.getUsers();
        List<User11> result = new ArrayList<>();

        for (User11 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User11> result, User11 user) {
        User11 clone = user.clone();

        //skip bad users
        if (clone != User11.NULL_USER) {
            result.add(clone);
        }
    }

    public User11 createOrUpdate(User11 user) {
        return dataSource.createOrUpdate(user);
    }

    public User11 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User11> users = dataSource.getUsers();
        for (User11 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User11.NULL_USER;
    }
}