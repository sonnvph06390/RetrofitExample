package com.example.retrofitexample.remote;

import com.example.retrofitexample.model.SOAnswersResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SOService {
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse>getAnswers();
    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    Call<SOAnswersResponse>getAnswers(@Query("tagged")String tags);

}
