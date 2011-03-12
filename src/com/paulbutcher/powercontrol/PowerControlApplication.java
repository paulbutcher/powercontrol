package com.paulbutcher.powercontrol;

import android.app.Application;

public class PowerControlApplication extends Application
{
    public void onCreate() {
        powerControl = new PowerControlImpl(this);
    }

    public PowerControl getPowerControl() {
        return powerControl;
    }
    
    protected PowerControl powerControl;
}
