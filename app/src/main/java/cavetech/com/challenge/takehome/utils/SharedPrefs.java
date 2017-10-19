package cavetech.com.challenge.takehome.utils;

import android.content.SharedPreferences;
import cavetech.com.challenge.takehome.lib.MyApplication;

public class SharedPrefs {
    public static String getStringPref(String prefName) {
        SharedPreferences settings = _getSettings();
        return settings.getString(prefName, null);
    }

    private static SharedPreferences _getSettings() {
        final MyApplication app = MyApplication.getInstance();
        return app.getSharedPreferences(app.getPrefName(), 0);
    }
}
