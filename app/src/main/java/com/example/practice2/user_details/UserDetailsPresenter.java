package com.example.practice2.user_details;

import android.util.Log;

import com.example.practice2.pojo.CustomerExtraInfoModel;
import com.example.practice2.pojo.CustomerInfoModel;
import com.example.practice2.retrofit.APIClient;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserDetailsPresenter implements UserDetailsContract.UserDetailsBackend {

    private UserDetailsContract.UserDetailsView view;
    private UserDetailsService userDetailsService;

    public UserDetailsPresenter(UserDetailsContract.UserDetailsView view) {
        this.view = view;
        userDetailsService = APIClient.getClient().create(UserDetailsService.class);
    }

    @Override
    public void getUserList(long pageNumber) {

        userDetailsService.getCustomerData(pageNumber).enqueue(new Callback<CustomerExtraInfoModel>() {
            @Override
            public void onResponse(Call<CustomerExtraInfoModel> call, Response<CustomerExtraInfoModel> response) {
                Log.e("internetData", new Gson().toJson(response.body()));
                view.showUserList(response.body().getData());
            }

            @Override
            public void onFailure(Call<CustomerExtraInfoModel> call, Throwable t) {
                view.showToast("Something went wrong");
            }
        });

    }
}
