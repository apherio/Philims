package com.apherio.philims.data;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by apherio on 19/04/2016.
 * <p/>
 * API INTERFACE WHICH IS GETS THE MOVIES AND SORT QUERY
 */
public interface MoviesApiService {


    @GET("/3/discover/movie")
    void getResponse(@Query("sort_by") String sort_Type, @Query("api_key") String keyVal, Callback<MovieResponse> pojo);
}
