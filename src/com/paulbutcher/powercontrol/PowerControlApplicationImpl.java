package com.paulbutcher.powercontrol;

import android.app.Application;

public class PowerControlApplicationImpl extends Application implements PowerControlApplication
{
    public void onCreate() {
        powerControl = new PowerControlImpl(this);
    }

    public PowerControl getPowerControl() {
        return powerControl;
    }
    
    PowerControl powerControl;
}
