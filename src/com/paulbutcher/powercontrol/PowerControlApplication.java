package com.paulbutcher.powercontrol;

import android.app.Application;

public class PowerControlApplication extends Application implements PowerControlEnvironment
{
    public void onCreate() {
        powerControl = new PowerControlImpl(this);
    }

    public PowerControl getPowerControl() {
        return powerControl;
    }
    
    PowerControl powerControl;
}
