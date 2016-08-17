package com.e_magicindia.daggerrxpractice.dependencies;

import com.e_magicindia.daggerrxpractice.service.ExampleService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by mkodekar on 8/17/2016.
 */

@Module
public class ApiModule {

    @Provides
    @CustomScope
    ExampleService providerService(Retrofit retrofit) {
        return retrofit.create(ExampleService.class);
    }
}
