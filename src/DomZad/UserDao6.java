package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao6 {
    private DataSource7 dataSource = DataSource7.getInstance();

    public User8 getUserById(long id) {
        List<User8> users = dataSource.getUsers();
        for (User8 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User8.NULL_USER;
    }

    public List<User8> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User8> users = dataSource.getUsers();
        List<User8> result = new ArrayList<>();
        for (User8 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User8> getAllUsers() {
        List<User8> users = dataSource.getUsers();
        List<User8> result = new ArrayList<>();
        for (User8 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User8> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User8> users = dataSource.getUsers();
        List<User8> result = new ArrayList<>();

        for (User8 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User8> result, User8 user) {
        User8 clone = user.clone();

        //skip bad users
        if (clone != User8.NULL_USER) {
            result.add(clone);
        }
    }

    public User8 createOrUpdate(User8 user) {
        return dataSource.createOrUpdate(user);
    }

    public User8 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User8> users = dataSource.getUsers();
        for (User8 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User8.NULL_USER;
    }
}