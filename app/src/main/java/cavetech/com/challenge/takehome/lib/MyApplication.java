package cavetech.com.challenge.takehome.lib;

import android.app.Application;

public class MyApplication extends Application {

    private static MyApplication sInstance;
    public static final String SERVER_APP_NAME = "dji_challenge";
    public static final String PREFS_NAME = "dji_challenge";
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        initDaggerObjectGraph();
        MyLib.initialize(this);
    }

    //<editor-fold desc="Abstract Methods">

    public String getServerAppName() {
        return SERVER_APP_NAME;
    }

    public String getPrefName() {
        return PREFS_NAME;
    }

    protected void initDaggerObjectGraph() {
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }

    //</editor-fold>

    public static MyApplication getInstance() {
        return sInstance;
    }
}
