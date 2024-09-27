package com.example.practice2.delivery_time_slot;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.example.practice2.R;
import com.example.practice2.base_classes.BaseActivity;
import com.example.practice2.databinding.TimeSlotActivityBinding;

public class DeliveryTimeSlotActivity extends BaseActivity implements DeliveryTimeSlotContract.DeliveryTimeSlotView{

    private TimeSlotActivityBinding binding;

    private DeliveryTimeSlotPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.time_slot_activity);

        presenter = new DeliveryTimeSlotPresenter(this);

        binding.updateTimeSlotButton.setOnClickListener(v -> {
            presenter.updateDeliveryTimeSlot("Slot1", "06:00 AM", "09:00 PM");
        });

    }
}
