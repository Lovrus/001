package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl6 implements UserService6 {
    private UserDao9 userDao = new UserDao9();

    @Override
    public User10 deleteUser(long id) {
        User10 user = userDao.getUserById(id);
        Util9.markDeleted(user);
        userDao.createOrUpdate(user);

        return user;
    }

    @Override
    public User10 createOrUpdateUser(String name, long id, int level) {
        User10 user = new User10(name, id, level);
        return userDao.createOrUpdate(user);
    }

    @Override
    public List<User10> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    @Override
    public List<User10> getAllDeletedUsers() {
        List<User10> result = new ArrayList<>();
        for (User10 user : userDao.getAllUsers()) {
            if (Util9.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public List<User10> getUsersBetweenLevels(int fromLevel, int toLevel) {
        //it's better to get all users from DAO by one DB request, but we will use what we have
        List<User10> result = new ArrayList<>();
        for (int i = fromLevel; i <= toLevel; i++) {
            result.addAll(userDao.getUsersByLevel(i));
        }

        return result;
    }

    @Override
    public List<User10> filterOnlyActiveUsers(List<User10> allUsers) {
        //will not change allUsers list, create new one instead of that
        List<User10> result = new ArrayList<>();
        for (User10 user : allUsers) {
            if (User10.NULL_USER != user && !Util9.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public User10 getUsersById(long userId) {
        return userDao.getUsersById(userId);
    }
}