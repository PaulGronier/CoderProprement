package com.example.iem.coderproprement.objects;

/**
 * Created by iem on 20/10/2017.
 */

public class Device {
    private int hearthRate;
    private String deviceName;

    public Device(int hearthRate, String deviceName) {
        this.hearthRate = hearthRate;
        this.deviceName = deviceName;
    }

    public int getHearthRate() {
        return this.hearthRate;
    }

    public String getDeviceName () {
        return this.deviceName;
    }
}
