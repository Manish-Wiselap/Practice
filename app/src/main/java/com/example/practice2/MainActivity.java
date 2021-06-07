package com.example.practice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.practice2.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private TextView onlyTV;

    private String receivedDataFromFirstActivity;
    private long number;
    private String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlyTV = findViewById(R.id.onlyTV);

        collectDataFromFirstActivity();


    }

    private void collectDataFromFirstActivity(){

        Intent intent = getIntent();
        receivedDataFromFirstActivity = intent.getStringExtra(AppConstants.USER_INPUT_DATA);

        Log.e("receivedData", receivedDataFromFirstActivity);


        onlyTV.setText(receivedDataFromFirstActivity);

    }

}