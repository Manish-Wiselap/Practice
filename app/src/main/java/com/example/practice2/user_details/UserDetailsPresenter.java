package com.example.practice2.user_details;

import com.example.practice2.pojo.CustomerExtraInfoModel;
import com.example.practice2.retrofit.APIClient;

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
                view.showUserList(response.body().getData());
            }

            @Override
            public void onFailure(Call<CustomerExtraInfoModel> call, Throwable t) {
                view.showToast("Something went wrong");
            }
        });

    }
}
