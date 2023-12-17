package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao7 {
    private DataSource8 dataSource = DataSource8.getInstance();

    public User9 getUserById(long id) {
        List<User9> users = dataSource.getUsers();
        for (User9 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User9.NULL_USER;
    }

    public List<User9> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User9> users = dataSource.getUsers();
        List<User9> result = new ArrayList<>();
        for (User9 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User9> getAllUsers() {
        List<User9> users = dataSource.getUsers();
        List<User9> result = new ArrayList<>();
        for (User9 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User9> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User9> users = dataSource.getUsers();
        List<User9> result = new ArrayList<>();

        for (User9 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User9> result, User9 user) {
        User9 clone = user.clone();

        //skip bad users
        if (clone != User9.NULL_USER) {
            result.add(clone);
        }
    }

    public User9 createOrUpdate(User9 user) {
        return dataSource.createOrUpdate(user);
    }

    public User9 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User9> users = dataSource.getUsers();
        for (User9 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User9.NULL_USER;
    }
}