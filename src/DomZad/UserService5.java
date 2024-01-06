package DomZad;

import java.util.List;

public interface UserService5 {
    User10 deleteUser(long id);

    User10 createOrUpdateUser(String name, long id, int level);

    List<User10> getUsersByName(String name);

    List<User10> getAllDeletedUsers();

    List<User10> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User10> filterOnlyActiveUsers(List<User10> allUsers);

    User10 getUsersById(long userId);
}
