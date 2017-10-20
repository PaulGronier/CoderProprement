package com.example.iem.coderproprement.manager;

import com.example.iem.coderproprement.objects.Device;

/**
 * Created by iem on 20/10/2017.
 */
public class SingletonButton {


    private SingletonButton(){}

    private static SingletonButton INSTANCE;
    Device device;

    public static SingletonButton getInstance() {
        if (INSTANCE == null){
            INSTANCE = new SingletonButton();
        }
        return INSTANCE;
    }

    public String getData() {
        return "Hola";
    }

    public void connect (Device device) {
        this.device = device;
    }

    public int getRate () {
        return device.getHearthRate();
    }

    public String getName () {
        return device.getDeviceName();
    }


}

