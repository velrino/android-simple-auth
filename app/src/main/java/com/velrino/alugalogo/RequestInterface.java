package com.velrino.alugalogo;

import com.velrino.alugalogo.Models.ServerRequest;
import com.velrino.alugalogo.Models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RequestInterface {

    @POST("auth/login")
    Call<ServerResponse> operation(@Body ServerRequest request);

}