package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel6 implements Model6 {

    private ModelData7 modelData = new ModelData7();

    @Override
    public ModelData7 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User8> users = new ArrayList<>();
        users.add(new User8("A", 1l, 1));
        users.add(new User8("B", 2l, 1));
        modelData.setUsers(users);
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }
}