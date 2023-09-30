package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao2 {
    private DataSource2 dataSource = DataSource2.getInstance();

    public User4 getUserById(long id) {
        List<User4> users = dataSource.getUsers();
        for (User4 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User4.NULL_USER;
    }

    public List<User4> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User4> users = dataSource.getUsers();
        List<User4> result = new ArrayList<>();
        for (User4 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User4> getAllUsers() {
        List<User4> users = dataSource.getUsers();
        List<User4> result = new ArrayList<>();
        for (User4 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User4> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User4> users = dataSource.getUsers();
        List<User4> result = new ArrayList<>();

        for (User4 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User4> result, User4 user) {
        User4 clone = user.clone();

        //skip bad users
        if (clone != User4.NULL_USER) {
            result.add(clone);
        }
    }

    public User4 createOrUpdate(User4 user) {
        return dataSource.createOrUpdate(user);
    }

    public User4 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User4> users = dataSource.getUsers();
        for (User4 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User4.NULL_USER;
    }
}