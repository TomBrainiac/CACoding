package use_case.clear_users;

import entity.User;

import java.util.Map;

public class ClearOutputData {
    public ClearOutputData(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    Map<String, User> userMap;

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    @Override
    public String toString() {
        return "ClearOutputData{" +
                "userMap=" + userMap +
                '}';
    }
}
