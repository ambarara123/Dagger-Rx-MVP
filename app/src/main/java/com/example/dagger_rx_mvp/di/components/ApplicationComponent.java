package com.example.dagger_rx_mvp.di.components;

import com.example.dagger_rx_mvp.application.CakeApplication;
import com.example.dagger_rx_mvp.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = ApplicationModule.class)
@Singleton
public interface ApplicationComponent {

    void applyInjeftion(CakeApplication cakeApplication);
}
