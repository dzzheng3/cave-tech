package cavetech.com.challenge.takehome.utils;

import android.util.Log;

public class LogUtil {

    public static void logError(String message) {
        Log.e("DJIChallenge", message);
    }

    public static void logError(String message, Throwable e) {
        logError(message);
        logError(e.getMessage());
    }
}
