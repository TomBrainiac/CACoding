package interface_adapter.clear_users;

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private ClearViewModel clearViewModel;

    public ClearPresenter(ClearViewModel clearViewModel){
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        clearViewModel.getState().setUsers(clearOutputData.getUserMap());
    }
}
