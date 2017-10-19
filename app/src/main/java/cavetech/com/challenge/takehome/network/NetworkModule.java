package cavetech.com.challenge.takehome.network;

import cavetech.com.challenge.takehome.lib.AppConfig;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.Converter;

@Module
public class NetworkModule {

    @Provides
    @Singleton
    RestAdapter.Builder provideRestAdapterBuilder(RequestInterceptor headers,
                                                  //Client client,
                                                  Converter converter) {
        return new RestAdapter.Builder().setEndpoint(AppConfig.API_BASE_URL)
                                        .setLogLevel(AppConfig.REST_ADAPTER_LOG_LEVEL)
                                        .setRequestInterceptor(headers)
                                        .setConverter(converter);
    }

    @Provides
    @Singleton
    ApiService provideApiService(RestAdapter.Builder restAdapterBuilder, RequestInterceptor headers) {
        final RestAdapter restAdapter = restAdapterBuilder.setRequestInterceptor(headers).build();
        return restAdapter.create(ApiService.class);
    }
}
