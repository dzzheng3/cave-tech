package cavetech.com.challenge.takehome.lib;

import retrofit.RestAdapter;

public class AppConfig {
    public final static String API_BASE_URL = "http://dji-challenge.getsandbox.com/";
    public final static RestAdapter.LogLevel REST_ADAPTER_LOG_LEVEL = RestAdapter.LogLevel.FULL;
    public static final boolean DEBUG = true;
}
