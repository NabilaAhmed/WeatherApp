package com.example.android.weatherforcasting.Retrofit;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nabila on 18/11/2018.
 */
//?lat=35&lon=139&appid=be79726684aa412272346dbd506a6f1c

public class RetrofitClient {
    public static Retrofit instance;

    public static Retrofit getInstance() {
        if(instance==null){
            instance=new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/").addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build();
        }
        return instance;
    }
}
