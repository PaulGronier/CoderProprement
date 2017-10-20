package com.example.iem.coderproprement.activity;

import com.example.iem.coderproprement.manager.DataManager;
import com.example.iem.coderproprement.manager.DataManagerInterface;

/**
 * Created by iem on 20/10/2017.
 */

public class Application extends android.app.Application {
    private static Application application;

    private DataManagerInterface manager;

    public static Application application () {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;

        manager = new DataManager();
    }

    public DataManagerInterface getManager () {
        return manager;
    }
}
