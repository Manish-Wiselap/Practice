package com.example.practice2.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class WrappedResponse implements Serializable {

    @SerializedName("meta")
    @Expose
    private Meta meta;
    @SerializedName("data")
    @Expose
    private DeliveryTimeSlotModel data;

    public class Meta {
        private int id;
        private String message;
    }
}
