package com.paulbutcher.powercontrol;

import android.content.Context;
import android.os.PowerManager;

public class PowerControlImpl implements PowerControl
{
    public PowerControlImpl(Context context) {
        PowerManager powerManager = (PowerManager)context.getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "PowerControl");
    }

    public void disablePowerOff() {
        wakeLock.acquire();
    }
    
    public void enablePowerOff() {
        wakeLock.release();
    }
    
    private PowerManager.WakeLock wakeLock;
}
