package com.example.android.weatherforcasting.Retrofit;

import com.example.android.weatherforcasting.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

;

/**
 * Created by nabila on 18/11/2018.
 */

public interface OpenWeatherAPI {
    @GET("weather")
    Observable<WeatherResult> getWeather(@Query("lat")String lat
            ,@Query("lon")String lng,@Query("appid")String appid,@Query("units")String units);
}
