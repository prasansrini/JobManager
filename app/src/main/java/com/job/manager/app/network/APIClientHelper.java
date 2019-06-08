package com.job.manager.app.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class APIClientHelper {
    private static final String BASE_URL = "https://api.myjson.com/";
    private static Retrofit mRetrofit;

    private APIClientHelper() {

    }

    public static Retrofit getInstance() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return mRetrofit;
    }
}
