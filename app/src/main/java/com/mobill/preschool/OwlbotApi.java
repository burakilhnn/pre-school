package com.mobill.preschool;

import com.mobill.preschool.api.Root;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface OwlbotApi {

    @Headers("Authorization: Token d70bea40a656fec7a8bc3f835a17c8a323e095d8")
    @GET("api/v4/dictionary/{word}")
    Call<Root> getRoot(@Path("word") String word);
}
