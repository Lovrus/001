package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao5 {
    private DataSource6 dataSource = DataSource6.getInstance();

    public User7 getUserById(long id) {
        List<User7> users = dataSource.getUsers();
        for (User7 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User7.NULL_USER;
    }

    public List<User7> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User7> users = dataSource.getUsers();
        List<User7> result = new ArrayList<>();
        for (User7 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User7> getAllUsers() {
        List<User7> users = dataSource.getUsers();
        List<User7> result = new ArrayList<>();
        for (User7 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User7> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User7> users = dataSource.getUsers();
        List<User7> result = new ArrayList<>();

        for (User7 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User7> result, User7 user) {
        User7 clone = user.clone();

        //skip bad users
        if (clone != User7.NULL_USER) {
            result.add(clone);
        }
    }

    public User7 createOrUpdate(User7 user) {
        return dataSource.createOrUpdate(user);
    }

    public User7 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User7> users = dataSource.getUsers();
        for (User7 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User7.NULL_USER;
    }
}