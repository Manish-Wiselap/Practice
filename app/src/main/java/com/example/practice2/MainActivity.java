package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import com.example.practice2.databinding.ActivityMainBinding;
import com.example.practice2.pojo.StudentModel;
import com.example.practice2.recycler_view_example.RecyclerViewExample;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        StudentModel studentModel = new StudentModel("Manish Garhwal", 12, 23, "manishg.wiselap@gmail.com");

        activityMainBinding.setStudentInfo(studentModel);

        activityMainBinding.btn1.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, RecyclerViewExample.class));
        });

    }

}