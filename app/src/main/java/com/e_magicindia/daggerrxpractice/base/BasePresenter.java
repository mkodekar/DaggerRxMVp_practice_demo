package com.e_magicindia.daggerrxpractice.base;

import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by mkodekar on 8/17/2016.
 */

public abstract class BasePresenter implements Presenter {
    private CompositeSubscription compositeSubscription;

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {


    }

    private CompositeSubscription configureSubscription() {
        if (compositeSubscription == null  ||  compositeSubscription.isUnsubscribed())  {
            compositeSubscription = new CompositeSubscription();
        }

        return compositeSubscription;
    }



    @Override
    public void onResume() {
        configureSubscription();

    }


    @Override
    public void onDestroy() {
        unSubscribeAll();
    }

    protected void unSubscribeAll() {
        if (compositeSubscription != null) {
            compositeSubscription.unsubscribe();
            compositeSubscription.clear();
//            compositeSubscription = null;
        }
    }

    protected <T> void subscribe(Observable<T> observable, Observer<T> observer) {
        Subscription subscription = observable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.computation())
                .subscribe(observer);
        configureSubscription().add(subscription);
    }


}
