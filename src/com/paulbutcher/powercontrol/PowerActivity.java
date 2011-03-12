package com.paulbutcher.powercontrol;

import android.app.Activity;
import android.os.Bundle;
import android.os.PowerManager;
import android.view.View;

public class PowerActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        PowerControlApplication app = (PowerControlApplication)getApplicationContext();
        powerControl = app.getPowerControl();
    }
    
    public void startImportant(View button) {
        powerControl.disablePowerOff();
    }
    
    public void stopImportant(View button) {
        powerControl.enablePowerOff();
    }
    
    private PowerControl powerControl;
}
