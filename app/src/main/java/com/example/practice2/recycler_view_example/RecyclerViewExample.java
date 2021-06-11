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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.recycler_view_example_activity);

        binding.listRV.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<StudentModel> list = new ArrayList<>();
        list.add(new StudentModel("Manish", 12, 23, "abc1@gmail.com"));
        list.add(new StudentModel("Manish 2", 13, 24, "abc2@gmail.com"));
        list.add(new StudentModel("Manish 3", 1, 25, "abc3@gmail.com"));
        list.add(new StudentModel("Manish 4", 10, 26, "abc4@gmail.com"));
        list.add(new StudentModel("Manish 5", 123, 27, "abc5@gmail.com"));
        list.add(new StudentModel("Manish 6", 14, 28, "abc6@gmail.com"));
        list.add(new StudentModel("Manish 7", 19, 29, "abc7@gmail.com"));

        ArrayList<ProductInfo> prodList = new ArrayList<>();
        prodList.add(new ProductInfo("Tea"));
        prodList.add(new ProductInfo("Coffee"));
        prodList.add(new ProductInfo("Green Tea"));

        adapter = new StudentListAdapter(prodList);

        binding.listRV.setAdapter(adapter);

    }
}
