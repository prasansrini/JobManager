package com.job.manager.app.network;

import com.job.manager.app.pojo.JobData;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JobAPIInterface {
    @GET("bins/w2km6")
    Call<JobData> fetchJobData();
}
