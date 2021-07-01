package com.example.practice2.delivery_time_slot;

import android.util.Log;
import android.widget.Toast;

import com.example.practice2.pojo.DeliveryTimeSlotModel;
import com.example.practice2.pojo.WrappedResponse;
import com.example.practice2.retrofit.APIClient;
import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DeliveryTimeSlotPresenter implements DeliveryTimeSlotContract.DeliveryTimeSlotBackend{

    private DeliveryTimeSlotContract.DeliveryTimeSlotView view;
    private DeliveryTimeSlotService deliveryTimeSlotService;

    public DeliveryTimeSlotPresenter(DeliveryTimeSlotContract.DeliveryTimeSlotView view) {
        this.view = view;
        deliveryTimeSlotService = APIClient.getClient().create(DeliveryTimeSlotService.class);
    }

    @Override
    public void updateDeliveryTimeSlot(String timeSlotName, String timeSlotStartTime, String timeSlotEndTime) {

        view.showLoadingDialog();

        DeliveryTimeSlotModel deliveryTimeSlotModel = new DeliveryTimeSlotModel(
                timeSlotStartTime,
                timeSlotEndTime,
                1029,
                322,
                timeSlotName
        );

        Log.e("sendingData", new Gson().toJson(deliveryTimeSlotModel));

        deliveryTimeSlotService.updateDeliveryTimeSlot(deliveryTimeSlotModel).enqueue(new Callback<WrappedResponse>() {
            @Override
            public void onResponse(Call<WrappedResponse> call, Response<WrappedResponse> response) {
                view.hideLoadingDialog();
                view.showToastMessage("Updated Successfully", Toast.LENGTH_LONG);
                Log.e("onSuccess", new Gson().toJson(response));
            }

            @Override
            public void onFailure(Call<WrappedResponse> call, Throwable t) {
                view.hideLoadingDialog();
                Log.e("onSuccess", t.getMessage());
            }
        });

    }
}
