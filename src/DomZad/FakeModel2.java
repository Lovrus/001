package DomZad;
import java.util.ArrayList;
import java.util.List;

public class FakeModel2 implements Model2 {

    private ModelData2 modelData = new ModelData2();

    @Override
    public ModelData2 getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers() {
        List<User4> users = new ArrayList<>();
        users.add(new User4("A", 1l, 1));
        users.add(new User4("B", 2l, 1));
        modelData.setUsers(users);
    }
}