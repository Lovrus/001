package DomZad;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao4 userDao = new UserDao4();

    @Override
    public User6 deleteUser(long id) {
        User6 user = userDao.getUserById(id);
        Util4_1.markDeleted(user);
        userDao.createOrUpdate(user);

        return user;
    }

    @Override
    public User6 createOrUpdateUser(String name, long id, int level) {
        User6 user = new User6(name, id, level);
        return userDao.createOrUpdate(user);
    }

    @Override
    public List<User6> getUsersByName(String name) {
        return userDao.getUsersByName(name);
    }

    @Override
    public List<User6> getAllDeletedUsers() {
        List<User6> result = new ArrayList<>();
        for (User6 user : userDao.getAllUsers()) {
            if (Util4_1.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public List<User6> getUsersBetweenLevels(int fromLevel, int toLevel) {
        //it's better to get all users from DAO by one DB request, but we will use what we have
        List<User6> result = new ArrayList<>();
        for (int i = fromLevel; i <= toLevel; i++) {
            result.addAll(userDao.getUsersByLevel(i));
        }

        return result;
    }

    @Override
    public List<User6> filterOnlyActiveUsers(List<User6> allUsers) {
        //will not change allUsers list, create new one instead of that
        List<User6> result = new ArrayList<>();
        for (User6 user : allUsers) {
            if (User6.NULL_USER != user && !Util4_1.isUserDeleted(user)) {
                result.add(user);
            }
        }

        return result;
    }

    @Override
    public User6 getUsersById(long userId) {
        return userDao.getUsersById(userId);
    }
}
