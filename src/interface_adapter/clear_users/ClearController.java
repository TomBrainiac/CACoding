package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;
import use_case.signup.SignupInputBoundary;
import use_case.signup.SignupInputData;

public class ClearController {
    final ClearInputBoundary userClearUseCaseInteractor;
    public ClearController(ClearInputBoundary userClearUseCaseInteractor) {
        this.userClearUseCaseInteractor = userClearUseCaseInteractor;
    }

    public void execute() {
        userClearUseCaseInteractor.execute();
    }
}
