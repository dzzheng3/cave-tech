package cavetech.com.challenge.takehome.lib;

import android.app.Application;
import cavetech.com.challenge.takehome.data.DataModule;
import cavetech.com.challenge.takehome.data.DataModule_ProvideBusFactory;
import cavetech.com.challenge.takehome.data.DataModule_ProvideConverterFactory;
import cavetech.com.challenge.takehome.data.DataModule_ProvideGlideFactory;
import cavetech.com.challenge.takehome.data.DataModule_ProvideGsonFactory;
import cavetech.com.challenge.takehome.network.ApiClient;
import cavetech.com.challenge.takehome.network.ApiClient_MembersInjector;
import cavetech.com.challenge.takehome.network.ApiService;
import cavetech.com.challenge.takehome.network.NetworkModule;
import cavetech.com.challenge.takehome.network.NetworkModule_ProvideApiServiceFactory;
import cavetech.com.challenge.takehome.network.NetworkModule_ProvideRestAdapterBuilderFactory;
import com.google.gson.Gson;
import com.squareup.otto.Bus;
import dagger.MembersInjector;
import dagger.internal.MembersInjectors;
import dagger.internal.ScopedProvider;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.Converter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DaggerAppComponent implements AppComponent {
  private Provider<Bus> provideBusProvider;
  private Provider<Application> provideApplicationProvider;
  private Provider<Glider> provideGlideProvider;
  private MembersInjector<BaseActivity> baseActivityMembersInjector;
  private MembersInjector<BaseFragment> baseFragmentMembersInjector;
  private Provider<Gson> provideGsonProvider;
  private MembersInjector<Session> sessionMembersInjector;
  private Provider<RequestInterceptor> provideHeadersProvider;
  private Provider<Converter> provideConverterProvider;
  private Provider<RestAdapter.Builder> provideRestAdapterBuilderProvider;
  private Provider<ApiService> provideApiServiceProvider;
  private MembersInjector<ApiClient> apiClientMembersInjector;

  private DaggerAppComponent(Builder builder) {  
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {  
    return new Builder();
  }

  private void initialize(final Builder builder) {  
    this.provideBusProvider = ScopedProvider.create(DataModule_ProvideBusFactory.create(builder.dataModule));
    this.provideApplicationProvider = ScopedProvider.create(AppModule_ProvideApplicationFactory.create(builder.appModule));
    this.provideGlideProvider = ScopedProvider.create(DataModule_ProvideGlideFactory.create(builder.dataModule, provideApplicationProvider));
    this.baseActivityMembersInjector = BaseActivity_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideBusProvider, provideGlideProvider);
    this.baseFragmentMembersInjector = BaseFragment_MembersInjector.create((MembersInjector) MembersInjectors.noOp(), provideBusProvider, provideGlideProvider);
    this.provideGsonProvider = ScopedProvider.create(DataModule_ProvideGsonFactory.create(builder.dataModule));
    this.sessionMembersInjector = Session_MembersInjector.create(provideGsonProvider);
    this.provideHeadersProvider = ScopedProvider.create(AppModule_ProvideHeadersFactory.create(builder.appModule));
    this.provideConverterProvider = ScopedProvider.create(DataModule_ProvideConverterFactory.create(builder.dataModule, provideGsonProvider));
    this.provideRestAdapterBuilderProvider = ScopedProvider.create(NetworkModule_ProvideRestAdapterBuilderFactory.create(builder.networkModule, provideHeadersProvider, provideConverterProvider));
    this.provideApiServiceProvider = ScopedProvider.create(NetworkModule_ProvideApiServiceFactory.create(builder.networkModule, provideRestAdapterBuilderProvider, provideHeadersProvider));
    this.apiClientMembersInjector = ApiClient_MembersInjector.create(provideApiServiceProvider, provideGsonProvider);
  }

  @Override
  public void inject(BaseActivity baseActivity) {  
    baseActivityMembersInjector.injectMembers(baseActivity);
  }

  @Override
  public void inject(BaseFragment baseFragment) {  
    baseFragmentMembersInjector.injectMembers(baseFragment);
  }

  @Override
  public void inject(Session session) {  
    sessionMembersInjector.injectMembers(session);
  }

  @Override
  public void inject(ApiClient apiClient) {  
    apiClientMembersInjector.injectMembers(apiClient);
  }

  public static final class Builder {
    private AppModule appModule;
    private DataModule dataModule;
    private NetworkModule networkModule;
  
    private Builder() {  
    }
  
    public AppComponent build() {  
      if (appModule == null) {
        throw new IllegalStateException("appModule must be set");
      }
      if (dataModule == null) {
        this.dataModule = new DataModule();
      }
      if (networkModule == null) {
        this.networkModule = new NetworkModule();
      }
      return new DaggerAppComponent(this);
    }
  
    public Builder appModule(AppModule appModule) {  
      if (appModule == null) {
        throw new NullPointerException("appModule");
      }
      this.appModule = appModule;
      return this;
    }
  
    public Builder dataModule(DataModule dataModule) {  
      if (dataModule == null) {
        throw new NullPointerException("dataModule");
      }
      this.dataModule = dataModule;
      return this;
    }
  
    public Builder networkModule(NetworkModule networkModule) {  
      if (networkModule == null) {
        throw new NullPointerException("networkModule");
      }
      this.networkModule = networkModule;
      return this;
    }
  }
}

