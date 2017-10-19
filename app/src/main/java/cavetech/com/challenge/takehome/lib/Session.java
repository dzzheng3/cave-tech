package cavetech.com.challenge.takehome.lib;

import com.google.gson.Gson;
import cavetech.com.challenge.takehome.utils.SharedPrefs;
import javax.inject.Inject;

public class Session {

    @Inject static Gson sGson;

    private static final String UID = "UID";

    public static String getUid() {
        return SharedPrefs.getStringPref(UID);
    }
}
