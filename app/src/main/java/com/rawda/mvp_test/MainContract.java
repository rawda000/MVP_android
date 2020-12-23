package com.rawda.mvp_test;

public interface MainContract {
    interface View {
        void showError();

        void showSuccess();
    }

    interface Presenter {
        void doLogin(String email, String password);
    }
}
