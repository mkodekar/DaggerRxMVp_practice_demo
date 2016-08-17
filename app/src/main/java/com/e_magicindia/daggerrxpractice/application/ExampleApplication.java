package com.e_magicindia.daggerrxpractice.application;

import android.app.Application;

import com.e_magicindia.daggerrxpractice.configuration.AppConfig;
import com.e_magicindia.daggerrxpractice.dependencies.ApiComponent;
import com.e_magicindia.daggerrxpractice.dependencies.DaggerApiComponent;
import com.e_magicindia.daggerrxpractice.dependencies.DaggerNetwrokComponent;
import com.e_magicindia.daggerrxpractice.dependencies.NetworkModule;
import com.e_magicindia.daggerrxpractice.dependencies.NetwrokComponent;

/**
 * Created by mkodekar on 8/17/2016.
 */

public class ExampleApplication extends Application {

    private ApiComponent apiComponent;

    @Override
    public void onCreate() {
        resolveDependency();
        super.onCreate();
    }

    private void resolveDependency() {

        apiComponent = DaggerApiComponent.builder()
                .netwrokComponent(getNetworkComponent())
                .build();
    }

    public NetwrokComponent getNetworkComponent() {
        return DaggerNetwrokComponent.builder()
                .networkModule(new NetworkModule(AppConfig.BASE_URL))
                .build();
    }

    public ApiComponent getApiComponent() {
        return apiComponent;
    }
}
