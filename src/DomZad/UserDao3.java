package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserDao3 {
    private DataSource3 dataSource = DataSource3.getInstance();

    public User5 getUserById(long id) {
        List<User5> users = dataSource.getUsers();
        for (User5 user : users) {
            if (user.getId() == id) {
                return user.clone();
            }
        }
        return User5.NULL_USER;
    }

    public List<User5> getUsersByName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException();

        List<User5> users = dataSource.getUsers();
        List<User5> result = new ArrayList<>();
        for (User5 user : users) {
            if (name.equals(user.getName())) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public List<User5> getAllUsers() {
        List<User5> users = dataSource.getUsers();
        List<User5> result = new ArrayList<>();
        for (User5 user : users) {
            addUserToResult(result, user);
        }
        return result;
    }

    public List<User5> getUsersByLevel(int level) {
        if (level < 1) throw new IllegalArgumentException();

        List<User5> users = dataSource.getUsers();
        List<User5> result = new ArrayList<>();

        for (User5 user : users) {
            if (level == user.getLevel()) {
                addUserToResult(result, user);
            }
        }
        return result;
    }

    public void addUserToResult(List<User5> result, User5 user) {
        User5 clone = user.clone();

        //skip bad users
        if (clone != User5.NULL_USER) {
            result.add(clone);
        }
    }

    public User5 createOrUpdate(User5 user) {
        return dataSource.createOrUpdate(user);
    }

    public User5 getUsersById(long userId) {
        if (userId < 1) throw new IllegalArgumentException();

        List<User5> users = dataSource.getUsers();
        for (User5 user : users) {
            if (userId == user.getId()) {
                return user;
            }
        }
        return User5.NULL_USER;
    }
}