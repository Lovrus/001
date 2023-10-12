package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel3 implements Model3 {

    private ModelData4 modelData = new ModelData4();

    @Override
    public ModelData4 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User5> users = new ArrayList<>();
        users.add(new User5("A", 1l, 1));
        users.add(new User5("B", 2l, 1));
        modelData.setUsers(users);
    }
}