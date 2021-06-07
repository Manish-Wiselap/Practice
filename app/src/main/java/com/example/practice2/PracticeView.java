package com.example.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.practice2.utilities.AppConstants;
import com.example.practice2.utilities.AppUtilities;

public class PracticeView extends AppCompatActivity {

    private EditText inputFieldET;
    private Button nextScreenBtn;

    private String userInputText = "";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice);

        inputFieldET = findViewById(R.id.inputFieldET);
        nextScreenBtn = findViewById(R.id.nextScreenBtn);

        nextScreenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userInputText = inputFieldET.getText().toString();

                if(userInputText != null && !TextUtils.isEmpty(userInputText)){
                    Log.e("enteredText", userInputText);

                    Intent moveForward = new Intent(PracticeView.this, MainActivity.class);
                    moveForward.putExtra(AppConstants.USER_INPUT_DATA, userInputText);
                    moveForward.putExtra("number", 45324);
                    startActivity(moveForward);

                }else{
                    AppUtilities.showToast("Please input something...", 1, PracticeView.this);
                }

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