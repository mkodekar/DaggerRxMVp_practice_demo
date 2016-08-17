package com.e_magicindia.daggerrxpractice.base;

import com.e_magicindia.daggerrxpractice.model.Example;
import com.e_magicindia.daggerrxpractice.service.ExampleViewInterface;

import java.util.ArrayList;

import rx.Observer;

/**
 * Created by mkodekar on 8/17/2016.
 */

public class ExamplePresenter extends BasePresenter implements Observer<ArrayList<Example>> {

    private ExampleViewInterface exampleViewInterface;

    public ExamplePresenter(ExampleViewInterface exampleViewInterface) {
        this.exampleViewInterface = exampleViewInterface;
    }

    @Override
    public void onCompleted() {
        exampleViewInterface.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
        exampleViewInterface.onError(e.getMessage());

    }

    @Override
    public void onNext(ArrayList<Example> examples) {
           exampleViewInterface.onExample(examples);
    }

    public void fetchExample() {
        unSubscribeAll();
        subscribe(exampleViewInterface.getExamples(), ExamplePresenter.this);
    }
}
