package com.e_magicindia.daggerrxpractice.service;

import com.e_magicindia.daggerrxpractice.model.Example;

import java.util.ArrayList;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by mkodekar on 8/17/2016.
 */

public interface ExampleService  {

    @GET("/itemMaster.php")
    Observable<ArrayList<Example>> getItems();
}
