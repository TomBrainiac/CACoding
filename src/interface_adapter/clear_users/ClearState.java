package interface_adapter.clear_users;

import entity.User;

import java.util.HashMap;
import java.util.Map;

public class ClearState {
    private Map<String, User> users;

    public ClearState(Map<String, User> users) {
        this.users = users;
    }

    public ClearState() {
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "ClearState{" +
                "users=" + users +
                '}';
    }
}
