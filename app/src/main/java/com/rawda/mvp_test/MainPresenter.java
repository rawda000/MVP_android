package com.rawda.mvp_test;

public class MainPresenter implements MainContract.Presenter {
    MainContract.View mView;

    public MainPresenter(MainContract.View view) {
        mView = view;
    }

    @Override
    public void doLogin(String email, String password) {
        if (email.equals("123@gmail.com") && password.equals("123")) mView.showSuccess();
        else mView.showError();
    }
}
