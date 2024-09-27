package com.example.practice2.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DeliveryTimeSlotModel implements Serializable {

    @SerializedName("deliveryTimeSlotStart")
    @Expose
    private String deliveryTimeSlotStart;
    @SerializedName("deliveryTimeSlotEnd")
    @Expose
    private String deliveryTimeSlotEnd;
    @SerializedName("deliveryTimeSlotId")
    @Expose
    private long deliveryTimeSlotId;
    @SerializedName("shopDetailsId")
    @Expose
    private long shopDetailsId;
    @SerializedName("deliveryTimeSlotName")
    @Expose
    private String deliveryTimeSlotName;

    public DeliveryTimeSlotModel(String deliveryTimeSlotStart, String deliveryTimeSlotEnd, long deliveryTimeSlotId, long shopDetailsId, String deliveryTimeSlotName) {
        this.deliveryTimeSlotStart = deliveryTimeSlotStart;
        this.deliveryTimeSlotEnd = deliveryTimeSlotEnd;
        this.deliveryTimeSlotId = deliveryTimeSlotId;
        this.shopDetailsId = shopDetailsId;
        this.deliveryTimeSlotName = deliveryTimeSlotName;
    }
}
