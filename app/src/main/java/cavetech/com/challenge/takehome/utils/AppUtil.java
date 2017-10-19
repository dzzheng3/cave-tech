package cavetech.com.challenge.takehome.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public class AppUtil {

    /**
     * @return The application version name as defined in the manifest.
     */
    public static String getVersionName(Context context) {
        try {
            final PackageManager pm = context.getPackageManager();
            final PackageInfo pInfo = pm.getPackageInfo(context.getPackageName(), 0);
            return pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            LogUtil.logError("Failed getting version name", e);
        }
        return null;
    }
}
