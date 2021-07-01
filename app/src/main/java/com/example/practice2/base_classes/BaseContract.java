package com.example.practice2.base_classes;

public interface BaseContract {

    interface BaseView{
        void showLoadingDialog();
        void hideLoadingDialog();
        void showToastMessage(String message, int toastLength);
    }

}
