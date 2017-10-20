package com.example.iem.coderproprement.manager;

import com.example.iem.coderproprement.objects.Device;

/**
 * Created by iem on 20/10/2017.
 */

public interface DataManagerInterface {

    String getData();
    void connect (Device device);
    int getRate ();
    String getName ();

}
