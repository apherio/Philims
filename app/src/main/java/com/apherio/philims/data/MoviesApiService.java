package com.apherio.philims.data;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by apherio on 19/04/2016.
 * <p/>
 * API INTERFACE WHICH IS GETS THE MOVIES AND SORT QUERY
 */
public interface MoviesApiService {


    //The url which i request in Onstart method  in movies fragment using path is somewhat like this
    /*
     *http://api.themoviedb.org/3/movie/popular?api_key=
     *
     * where i am using sort_by as path to replace it and update the recyclerview look at
     *  /res/values/array.xml
     */

    @GET("/3/movie/{sort_by}")
    void getResponse(@Path("sort_by") String sort_Type, @Query("api_key") String keyVal, Callback<MovieResponse> pojo);


}
