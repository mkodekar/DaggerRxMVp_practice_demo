package com.e_magicindia.daggerrxpractice.dependencies;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by mkodekar on 8/17/2016.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}
