package com.example.practice2.recycler_view_example;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.practice2.R;
import com.example.practice2.databinding.UserProfilesSingleCellBinding;
import com.example.practice2.pojo.CustomerInfoModel;

import java.util.ArrayList;

public class UserProfileAdapter extends RecyclerView.Adapter<UserProfileAdapter.UserProfileViewHolder> {

    private ArrayList<CustomerInfoModel> userInfoList;
    private Context context;

    public UserProfileAdapter(ArrayList<CustomerInfoModel> userInfoList, Context context) {
        this.context = context;
        this.userInfoList = userInfoList;
    }

    @NonNull
    @Override
    public UserProfileAdapter.UserProfileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        UserProfilesSingleCellBinding binding = DataBindingUtil.inflate(inflater, R.layout.user_profiles_single_cell, parent ,false);
        return new UserProfileViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull UserProfileAdapter.UserProfileViewHolder holder, int position) {
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        if(userInfoList != null){
            return userInfoList.size();
        }else{
            return 0;
        }
    }

    public class UserProfileViewHolder extends RecyclerView.ViewHolder{

        public UserProfilesSingleCellBinding binding;

        public UserProfileViewHolder(UserProfilesSingleCellBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void setData(int position){
            binding.setUserProfile(userInfoList.get(position));
            binding.setPosition(position);
            Glide.with(context).load(userInfoList.get(position).getAvatar()).into(binding.userProfilePicture);

            binding.userNameET.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    Log.e("text ", "change on " + position + " " + s.toString());
                    userInfoList.get(position).setFirst_name(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

        }

    }

    public ArrayList<CustomerInfoModel> getUpdatedUserList(){
        return userInfoList;
    }

}
