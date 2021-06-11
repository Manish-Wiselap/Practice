package com.example.practice2.recycler_view_example;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practice2.R;
import com.example.practice2.databinding.ProductInfoSingleCellBinding;
import com.example.practice2.databinding.StudentInfoSingleCellBinding;
import com.example.practice2.pojo.ProductInfo;
import com.example.practice2.pojo.StudentModel;

import java.util.ArrayList;

public class StudentListAdapter extends RecyclerView.Adapter<StudentListAdapter.StudentListViewHolder> {

    private ArrayList<ProductInfo> studentList;

    public StudentListAdapter(ArrayList<ProductInfo> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentListAdapter.StudentListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ProductInfoSingleCellBinding binding = DataBindingUtil.inflate(inflater, R.layout.product_info_single_cell, parent ,false);
        return new StudentListViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentListAdapter.StudentListViewHolder holder, int position) {
        holder.setData(position);
    }

    @Override
    public int getItemCount() {
        if(studentList != null){
            return studentList.size();
        }else{
            return 0;
        }
    }

    public class StudentListViewHolder extends RecyclerView.ViewHolder{

        private ProductInfoSingleCellBinding cellBinding;

        public StudentListViewHolder(ProductInfoSingleCellBinding cellBinding) {
            super(cellBinding.getRoot());
            this.cellBinding = cellBinding;
        }

        public void setData(int position){
            cellBinding.setProductModel(studentList.get(position));
        }

    }

}
