package com.example.practice2.delivery_time_slot;

public interface DeliveryTimeSlotContract {

    interface DeliveryTimeSlotView{

    }

    interface DeliveryTimeSlotBackend{
        void updateDeliveryTimeSlot(String timeSlotName, String timeSlotStartTime, String timeSlotEndTime);
    }

}
