package com.example.practice2.delivery_time_slot;

import com.example.practice2.pojo.DeliveryTimeSlotModel;
import com.example.practice2.pojo.WrappedResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface DeliveryTimeSlotService {

    @POST("updateDeliveryTimeSlot")
    Call<WrappedResponse> updateDeliveryTimeSlot(
            @Body DeliveryTimeSlotModel deliveryTimeSlotModel
    );

}
