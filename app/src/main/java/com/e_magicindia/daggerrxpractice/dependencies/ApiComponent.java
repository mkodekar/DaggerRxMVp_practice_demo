package com.e_magicindia.daggerrxpractice.dependencies;

import com.e_magicindia.daggerrxpractice.MainActivity;

import dagger.Component;

/**
 * Created by mkodekar on 8/17/2016.
 */

@CustomScope
@Component(modules = ApiModule.class, dependencies = NetwrokComponent.class)
public interface ApiComponent {
    void inject(MainActivity activity);

}
