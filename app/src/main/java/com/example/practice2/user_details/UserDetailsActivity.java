package com.example.practice2.user_details;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.practice2.R;
import com.example.practice2.databinding.RecyclerViewExampleActivityBinding;
import com.example.practice2.pojo.CustomerInfoModel;
import com.example.practice2.recycler_view_example.UserProfileAdapter;
import com.google.gson.Gson;

import java.util.ArrayList;

public class UserDetailsActivity extends AppCompatActivity implements UserDetailsContract.UserDetailsView {

    private RecyclerViewExampleActivityBinding binding;

    private UserDetailsPresenter userDetailsPresenter;
    private UserProfileAdapter userProfileAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.recycler_view_example_activity);
        binding.setCallBack(this);

        binding.listRV.setLayoutManager(new LinearLayoutManager(this));
        userDetailsPresenter = new UserDetailsPresenter(this);

        userDetailsPresenter.getUserList(1);

    }

    @Override
    public void showUserList(ArrayList<CustomerInfoModel> userList) {
        userProfileAdapter = new UserProfileAdapter(userList, this);
        binding.listRV.setAdapter(userProfileAdapter);
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }

    public void onGetListBtnClicked(){
        ArrayList<CustomerInfoModel> customerInfoModels = userProfileAdapter.getUpdatedUserList();
        Log.e("updateList", new Gson().toJson(customerInfoModels));
    }

}
