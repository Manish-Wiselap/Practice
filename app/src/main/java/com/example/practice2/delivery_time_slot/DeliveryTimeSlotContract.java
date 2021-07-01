package com.example.practice2.delivery_time_slot;

import com.example.practice2.base_classes.BaseContract;

public interface DeliveryTimeSlotContract {

    interface DeliveryTimeSlotView extends BaseContract.BaseView {

    }

    interface DeliveryTimeSlotBackend{
        void updateDeliveryTimeSlot(String timeSlotName, String timeSlotStartTime, String timeSlotEndTime);
    }

}
