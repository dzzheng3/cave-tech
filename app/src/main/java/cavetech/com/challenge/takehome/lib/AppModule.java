package cavetech.com.challenge.takehome.lib;

import android.app.Application;
import android.text.TextUtils;
import cavetech.com.challenge.takehome.data.DataModule;
import cavetech.com.challenge.takehome.network.BareMinimumRequest;
import cavetech.com.challenge.takehome.network.NetworkModule;
import cavetech.com.challenge.takehome.utils.DeviceUtil;
import cavetech.com.challenge.takehome.utils.NetworkUtil;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import retrofit.RequestInterceptor;

@Module(includes = { DataModule.class, NetworkModule.class }) public class AppModule {

    private MyApplication mApp;

    public AppModule(MyApplication app) {
        mApp = app;
    }

    @Provides @Singleton Application provideApplication() {
        return mApp;
    }

    @Provides @Singleton RequestInterceptor provideHeaders() {
        return new RequestInterceptor() {
            @Override public void intercept(RequestFacade request) {

                // Attach Bare Minimum Request
                final BareMinimumRequest bmr = NetworkUtil.getBareMinimumRequest();
                if (!TextUtils.isEmpty(bmr.getUid())) {
                    request.addQueryParam(NetworkUtil.UID_PARAM, bmr.getUid());
                }

                request.addQueryParam(NetworkUtil.TYPE_PARAM, bmr.getType());
                request.addQueryParam(NetworkUtil.APP_VERSION_PARAM, bmr.getAppversion());
                request.addQueryParam(NetworkUtil.APP_PARAM, bmr.getApp());

                request.addQueryParam(NetworkUtil.ASSET_SCALE_PARAM,
                                      String.valueOf(DeviceUtil.getDeviceDensity(mApp)));
            }
        };
    }
}
