package com.example.iem.coderproprement.activity;

import com.example.iem.coderproprement.manager.SingletonButton;

/**
 * Created by iem on 20/10/2017.
 */

public class Application extends android.app.Application {
    private static Application application;

    private SingletonButton manager;

    public static Application application () {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        manager = SingletonButton.getInstance();
    }

    public SingletonButton getManager () {
        return manager;
    }
}
