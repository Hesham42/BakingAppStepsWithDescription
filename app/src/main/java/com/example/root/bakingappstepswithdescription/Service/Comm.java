package com.example.root.bakingappstepswithdescription.Service;

import com.example.root.bakingappstepswithdescription.Pojo.Recipe;

import java.util.List;

import retrofit2.Response;

/**
 * Created by root on 1/3/18.
 */
public interface Comm {
    void onFailure(String message);

    void onResponse(Response<List<Recipe>> response);
}