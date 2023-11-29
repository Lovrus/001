package DomZad;
import java.util.List;

public class ModelData7 {

    private List<User8> users;
    private User8 activeUser;
    private boolean displayDeletedUserList;

    public List<User8> getUsers() {
        return users;
    }

    public void setUsers(List<User8> users) {
        this.users = users;
    }

    public User8 getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User8 activeUser) {
        this.activeUser = activeUser;
    }

    public boolean isDisplayDeletedUserList() {
        return displayDeletedUserList;
    }

    public void setDisplayDeletedUserList(boolean displayDeletedUserList) {
        this.displayDeletedUserList = displayDeletedUserList;
    }
}