package com.e_magicindia.daggerrxpractice.service;

import com.e_magicindia.daggerrxpractice.model.Example;

import java.util.ArrayList;

import rx.Observable;

/**
 * Created by mkodekar on 8/17/2016.
 */

public interface ExampleViewInterface {

    void onCompleted();
    void onError(String message);
    void onExample(ArrayList<Example> examples);
    Observable<ArrayList<Example>> getExamples();
}
