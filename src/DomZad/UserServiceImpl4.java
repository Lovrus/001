package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl4 implements UserService4 {
    private UserDao7 userDao = new UserDao7();

    @Override
    public User9 deleteUser(long id) {
        User9 user = userDao.getUserById(id);
        Util7.markDeleted(user);
        userDao.createOrUpdate(user);

        return user;
    }

    @Override
    public User9 createOrUpdateUser(String name, long id, int level) {
        User9 user = new User9(name, id, level);
        return userDao.createOrUpdate(user);
    }

    @Override
    public List<User9> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    @Override
    public List<User9> getAllDeletedUsers() {
        List<User9> result = new ArrayList<>();
        for (User9 user : userDao.getAllUsers()) {
            if (Util7.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public List<User9> getUsersBetweenLevels(int fromLevel, int toLevel) {
        //it's better to get all users from DAO by one DB request, but we will use what we have
        List<User9> result = new ArrayList<>();
        for (int i = fromLevel; i <= toLevel; i++) {
            result.addAll(userDao.getUsersByLevel(i));
        }

        return result;
    }

    @Override
    public List<User9> filterOnlyActiveUsers(List<User9> allUsers) {
        //will not change allUsers list, create new one instead of that
        List<User9> result = new ArrayList<>();
        for (User9 user : allUsers) {
            if (User9.NULL_USER != user && !Util7.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public User9 getUsersById(long userId) {
        return userDao.getUsersById(userId);
    }
}