package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao4 {
    private DataSource4 dataSource = DataSource4.getInstance();

    public User6 getUserById(long id) {
        List<User6> users = dataSource.getUsers();
        for (User6 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User6.NULL_USER;
    }

    public List<User6> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User6> users = dataSource.getUsers();
        List<User6> result = new ArrayList<>();
        for (User6 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User6> getAllUsers() {
        List<User6> users = dataSource.getUsers();
        List<User6> result = new ArrayList<>();
        for (User6 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User6> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User6> users = dataSource.getUsers();
        List<User6> result = new ArrayList<>();

        for (User6 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User6> result, User6 user) {
        User6 clone = user.clone();

        //skip bad users
        if (clone != User6.NULL_USER) {
            result.add(clone);
        }
    }

    public User6 createOrUpdate(User6 user) {
        return dataSource.createOrUpdate(user);
    }

    public User6 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User6> users = dataSource.getUsers();
        for (User6 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User6.NULL_USER;
    }
}