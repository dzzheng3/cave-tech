package cavetech.com.challenge.takehome.network;

public class BareMinimumRequest {

    String uid;
    String type;
    String appversion;
    String app;

    public BareMinimumRequest(String uid, String type, String appversion, String app) {
        this.uid = uid;
        this.type = type;
        this.appversion = appversion;
        this.app = app;
    }

    public String getUid() {
        return uid;
    }

    public String getType() {
        return type;
    }

    public String getAppversion() {
        return appversion;
    }

    public String getApp() {
        return app;
    }
}
