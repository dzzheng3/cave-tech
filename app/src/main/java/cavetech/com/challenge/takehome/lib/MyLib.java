package cavetech.com.challenge.takehome.lib;

import cavetech.com.challenge.takehome.network.ApiClient;

public class MyLib {
    private static MyApplication myApplication;

    public static void initialize(MyApplication app) {
        myApplication = app;
        injectHelpers();
    }

    /**
     * Inject all helper classes that doesn't have constructor
     */
    private static void injectHelpers() {
        getAppComponent().inject(new Session());
        getAppComponent().inject(new ApiClient());
    }

    public static AppComponent getAppComponent() {
        return myApplication.getAppComponent();
    }
}
