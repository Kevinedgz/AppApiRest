package com.corp.kevined.appapirest.interfaces;

import com.corp.kevined.appapirest.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PostService {
    @GET("posts")
    Call<List<Post>>find(@Query("q")String q);
}
