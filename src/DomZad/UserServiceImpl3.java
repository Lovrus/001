package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl3 implements UserService3 {
    private UserDao6 userDao = new UserDao6();

    @Override
    public User8 deleteUser(long id) {
        User8 user = userDao.getUserById(id);
        Util6.markDeleted(user);
        userDao.createOrUpdate(user);

        return user;
    }

    @Override
    public User createOrUpdateUser(String name, long id, int level) {
        User8 user = new User8(name, id, level);
        return userDao.createOrUpdate(user);
    }

    @Override
    public List<User8> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    @Override
    public List<User8> getAllDeletedUsers() {
        List<User8> result = new ArrayList<>();
        for (User8 user : userDao.getAllUsers()) {
            if (Util6.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public List<User8> getUsersBetweenLevels(int fromLevel, int toLevel) {
        //it's better to get all users from DAO by one DB request, but we will use what we have
        List<User8> result = new ArrayList<>();
        for (int i = fromLevel; i <= toLevel; i++) {
            result.addAll(userDao.getUsersByLevel(i));
        }

        return result;
    }

    @Override
    public List<User8> filterOnlyActiveUsers(List<User8> allUsers) {
        //will not change allUsers list, create new one instead of that
        List<User8> result = new ArrayList<>();
        for (User8 user : allUsers) {
            if (User8.NULL_USER != user && !Util6.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public User8 getUsersById(long userId) {
        return userDao.getUsersById(userId);
    }
}