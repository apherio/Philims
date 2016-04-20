package com.apherio.philims;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by apherio on 19/04/2016.
 */
public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
