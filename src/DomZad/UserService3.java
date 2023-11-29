package DomZad;

public interface UserService3 {
    User8 deleteUser(long id);

    User8 createOrUpdateUser(String name, long id, int level);

    List<User8> getUsersByName(String name);

    List<User8> getAllDeletedUsers();

    List<User8> getUsersBetweenLevels(int fromLevel, int toLevel);

    List<User8> filterOnlyActiveUsers(List<User8> allUsers);

    User getUsersById(long userId);
}
