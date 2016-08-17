package com.e_magicindia.daggerrxpractice.dependencies;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by mkodekar on 8/17/2016.
 */

@Singleton
@Component(modules = NetworkModule.class)
public interface NetwrokComponent {

    Retrofit retrofit();
}
