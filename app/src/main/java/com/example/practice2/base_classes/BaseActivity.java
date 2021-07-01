package com.example.practice2.base_classes;

import android.app.ProgressDialog;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity implements BaseContract.BaseView {

    public ProgressDialog progressDialog;

    @Override
    public void showLoadingDialog() {
        progressDialog = new ProgressDialog(this);
        progressDialog.show();
    }

    @Override
    public void hideLoadingDialog() {
        if(progressDialog != null){
            progressDialog.cancel();
        }
    }

    @Override
    public void showToastMessage(String message, int toastLength) {
        Toast.makeText(this, message, toastLength).show();
    }
}
