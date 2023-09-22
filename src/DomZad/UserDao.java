package DomZad;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private DataSource dataSource = DataSource.getInstance();

    public User3 getUserById(long id) {
        List<User3> users = dataSource.getUsers();
        for (User3 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User3.NULL_USER;
    }

    public List<User3> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User3> users = dataSource.getUsers();
        List<User3> result = new ArrayList<>();
        for (User3 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User3> getAllUsers() {
        List<User3> users = dataSource.getUsers();
        List<User3> result = new ArrayList<>();
        for (User3 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User3> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User3> users = dataSource.getUsers();
        List<User3> result = new ArrayList<>();

        for (User3 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User3> result, User3 user) {
        User3 clone = user.clone();

        //skip bad users
        if (clone != User3.NULL_USER) {
            result.add(clone);
        }
    }

    public User3 createOrUpdate(User3 user) {
        return dataSource.createOrUpdate(user);
    }

    public User3 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User3> users = dataSource.getUsers();
        for (User3 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User3.NULL_USER;
    }
}
