package DomZad;

import java.util.List;

public interface UserService2 {
    User7 deleteUser(long id);

    User7 createOrUpdateUser(String name, long id, int level);

    List<User7> getUsersByName(String name);

    List<User7> getAllDeletedUsers();

    List<User7> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User7> filterOnlyActiveUsers(List<User7> allUsers);

    User getUsersById(long userId);
}
