package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel7 implements Model7 {

    private ModelData8 modelData = new ModelData8();

    @Override
    public ModelData8 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User9> users = new ArrayList<>();
        users.add(new User9("A", 1l, 1));
        users.add(new User9("B", 2l, 1));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }
}