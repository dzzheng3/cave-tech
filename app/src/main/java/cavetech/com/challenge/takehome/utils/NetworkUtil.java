package cavetech.com.challenge.takehome.utils;

import cavetech.com.challenge.takehome.lib.MyApplication;
import cavetech.com.challenge.takehome.lib.Session;
import cavetech.com.challenge.takehome.network.BareMinimumRequest;

public class NetworkUtil {

    public static final String TYPE = "android";

    public static final String TYPE_PARAM = "type";
    public static final String UID_PARAM = "uid";
    public static final String APP_VERSION_PARAM = "appversion";
    public static final String APP_PARAM = "app";
    public static final String ASSET_SCALE_PARAM = "scale";

    /**
     * @return the bare minimum payload for network requests.
     */
    public static BareMinimumRequest getBareMinimumRequest() {
        return new BareMinimumRequest(Session.getUid(),
                                      TYPE,
                                      AppUtil.getVersionName(MyApplication.getInstance()),
                                      MyApplication.getInstance().getServerAppName());
    }
}

