package com.example.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.practice2.databinding.PracticeBinding;
import com.example.practice2.utilities.AppConstants;

public class PracticeView extends AppCompatActivity {

    private PracticeBinding practiceBinding;

    private String userInputText = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        practiceBinding = DataBindingUtil.setContentView(this, R.layout.practice);

        //TODO: set POJO class data in view at once



        practiceBinding.nextScreenBtn.setOnClickListener(v -> {

            userInputText = practiceBinding.inputFieldET.getText().toString();

            if(userInputText != null && !TextUtils.isEmpty(userInputText)){
                Log.e("enteredText", userInputText);

                Intent moveForward = new Intent(PracticeView.this, MainActivity.class);
                moveForward.putExtra(AppConstants.USER_INPUT_DATA, userInputText);
                moveForward.putExtra("number", 45324);
                startActivity(moveForward);

            }else{
                Toast.makeText(PracticeView.this, "Please input something...", Toast.LENGTH_LONG).show();
            }

        });

    }
}

// Pass data from one activity to another

// Create input field = DONE
// On click of button, get the value entered in input field  = DONE
// Pass the text collected from input field to the second activity
// Collect the text sent by first activity into second activity
// Show the text collected in second activity in text view
// First Activity: Practice View
// Second Activity: Main Activity