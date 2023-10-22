package use_case.clear_users;

import entity.User;
import use_case.signup.SignupOutputBoundary;

import java.util.Map;

public class ClearInteractor implements ClearInputBoundary{
    final ClearOutputBoundary clearPresenter;
    final ClearUserDataAccessInterface clearUserDataAccessInterface;

    public ClearInteractor(ClearOutputBoundary clearPresenter, ClearUserDataAccessInterface clearUserDataAccessInterface) {
        this.clearPresenter = clearPresenter;
        this.clearUserDataAccessInterface = clearUserDataAccessInterface;
    }

    @Override
    public void execute() {
        Map<String, User> users = clearUserDataAccessInterface.clear();
        clearPresenter.prepareSuccessView(new ClearOutputData(users));
    }
}
