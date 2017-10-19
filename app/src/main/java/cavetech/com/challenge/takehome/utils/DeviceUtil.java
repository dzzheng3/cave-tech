package cavetech.com.challenge.takehome.utils;

import android.content.Context;

public class DeviceUtil {

    public static float getDeviceDensity(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
