package DomZad;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl2 implements UserService2 {
    private UserDao5 userDao = new UserDao5();

    @Override
    public User7 deleteUser(long id) {
        User7 user = userDao.getUserById(id);
        Util5.markDeleted(user);
        userDao.createOrUpdate(user);

        return user;
    }

    @Override
    public User7 createOrUpdateUser(String name, long id, int level) {
        User7 user = new User7(name, id, level);
        return userDao.createOrUpdate(user);
    }

    @Override
    public List<User7> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    @Override
    public List<User7> getAllDeletedUsers() {
        List<User7> result = new ArrayList<>();
        for (User7 user : userDao.getAllUsers()) {
            if (Util5.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public List<User7> getUsersBetweenLevels(int fromLevel, int toLevel) {
        //it's better to get all users from DAO by one DB request, but we will use what we have
        List<User7> result = new ArrayList<>();
        for (int i = fromLevel; i <= toLevel; i++) {
            result.addAll(userDao.getUsersByLevel(i));
        }

        return result;
    }

    @Override
    public List<User7> filterOnlyActiveUsers(List<User7> allUsers) {
        //will not change allUsers list, create new one instead of that
        List<User7> result = new ArrayList<>();
        for (User7 user : allUsers) {
            if (User7.NULL_USER != user && !Util5.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public User7 getUsersById(long userId) {
        return userDao.getUsersById(userId);
    }
}