package com.example.practice2.user_details;

import com.example.practice2.pojo.CustomerExtraInfoModel;
import com.example.practice2.utilities.AppConstants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UserDetailsService {

    @GET(AppConstants.GET_USER_LIST)
    Call<CustomerExtraInfoModel> getCustomerData(
            @Query("page") long page
    );

    /*@GET(AppConstants.COMMENTS)
    Call<CustomerExtraInfoModel> getCommentData(
            @Query("postId") long postId
    );*/

}
