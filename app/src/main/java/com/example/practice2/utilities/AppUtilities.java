package com.example.practice2.utilities;

import android.content.Context;
import android.widget.Toast;

public class AppUtilities {

    public static void showToast(String message, int toastLength, Context context){
        Toast.makeText(context, message, toastLength).show();
    }

}
