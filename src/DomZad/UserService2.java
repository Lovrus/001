package DomZad;

import java.util.List;

public interface UserService2 {
    User deleteUser(long id);

    User createOrUpdateUser(String name, long id, int level);

    List<User> getUsersByName(String name);

    List<User> getAllDeletedUsers();

    List<User> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User> filterOnlyActiveUsers(List<User> allUsers);

    User getUsersById(long userId);
}
