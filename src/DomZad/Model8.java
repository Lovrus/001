package DomZad;

public interface Model8 {
    ModelData9 getModelData();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);

    void deleteUserById(long id);
}
