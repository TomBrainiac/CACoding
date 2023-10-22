package use_case.clear_users;

import entity.User;

import java.util.Map;

public interface ClearUserDataAccessInterface {

    Map<String, User> getUsers();
    Map<String, User> clear();
}
