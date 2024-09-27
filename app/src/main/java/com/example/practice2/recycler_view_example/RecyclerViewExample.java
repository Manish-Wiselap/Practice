package com.example.practice2.recycler_view_example;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.practice2.R;
import com.example.practice2.databinding.RecyclerViewExampleActivityBinding;
import com.example.practice2.pojo.ProductInfo;
import com.example.practice2.pojo.StudentModel;

import java.util.ArrayList;

public class RecyclerViewExample extends AppCompatActivity {

    private RecyclerViewExampleActivityBinding binding;

    private StudentListAdapter adapter;

    private UserProfileAdapter userProfileAdapter;

    GetUserDataFromRestAPI getUserDataFromRestAPI;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.recycler_view_example_activity);

        binding.listRV.setLayoutManager(new LinearLayoutManager(this));

        getUserDataFromRestAPI = new GetUserDataFromRestAPI();
        userProfileAdapter = new UserProfileAdapter(getUserDataFromRestAPI.getUserData(), this);

        binding.listRV.setAdapter(userProfileAdapter);
    }
}
