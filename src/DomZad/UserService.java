package DomZad;

import java.util.List;

public interface UserService {
    User6 deleteUser(long id);

    User6 createOrUpdateUser(String name, long id, int level);

    List<User6> getUsersByName(String name);

    List<User6> getAllDeletedUsers();

    List<User6> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User6> filterOnlyActiveUsers(List<User6> allUsers);

    User6 getUsersById(long userId);
}

