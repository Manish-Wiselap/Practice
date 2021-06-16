package com.example.practice2.recycler_view_example;

import android.util.Log;

import com.example.practice2.pojo.CustomerExtraInfoModel;
import com.example.practice2.pojo.CustomerInfoModel;
import com.example.practice2.retrofit.APIClient;
import com.google.gson.Gson;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetUserDataFromRestAPI {

    RecyclerDataInterface recyclerDataInterface;
    private CustomerExtraInfoModel customerExtraInfoModel;

    public GetUserDataFromRestAPI() {
        recyclerDataInterface = APIClient.getClient().create(RecyclerDataInterface.class);
    }

    public ArrayList<CustomerInfoModel> getUserData(){
        customerExtraInfoModel = new CustomerExtraInfoModel();

        Call<CustomerExtraInfoModel> call = recyclerDataInterface.getCustomerData(1);
        call.enqueue(new Callback<CustomerExtraInfoModel>() {
            @Override
            public void onResponse(Call<CustomerExtraInfoModel> call, Response<CustomerExtraInfoModel> response) {
                customerExtraInfoModel = response.body();
                Log.e("data", new Gson().toJson(response.body()));
            }

            @Override
            public void onFailure(Call<CustomerExtraInfoModel> call, Throwable t) {

            }
        });

        return customerExtraInfoModel.getData();

    }

}
