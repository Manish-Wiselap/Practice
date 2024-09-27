package com.example.practice2.user_details;

import com.example.practice2.pojo.CustomerInfoModel;

import java.util.ArrayList;

public interface UserDetailsContract {

    interface UserDetailsView {
        void showUserList(ArrayList<CustomerInfoModel> userList);
        void showToast(String message);
    }

    interface UserDetailsBackend{
        void getUserList(long pageNumber);
    }

}
