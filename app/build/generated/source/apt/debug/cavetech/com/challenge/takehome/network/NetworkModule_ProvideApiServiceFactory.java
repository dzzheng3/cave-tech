package cavetech.com.challenge.takehome.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter.Builder;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NetworkModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final NetworkModule module;
  private final Provider<Builder> restAdapterBuilderProvider;
  private final Provider<RequestInterceptor> headersProvider;

  public NetworkModule_ProvideApiServiceFactory(NetworkModule module, Provider<Builder> restAdapterBuilderProvider, Provider<RequestInterceptor> headersProvider) {  
    assert module != null;
    this.module = module;
    assert restAdapterBuilderProvider != null;
    this.restAdapterBuilderProvider = restAdapterBuilderProvider;
    assert headersProvider != null;
    this.headersProvider = headersProvider;
  }

  @Override
  public ApiService get() {  
    ApiService provided = module.provideApiService(restAdapterBuilderProvider.get(), headersProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<ApiService> create(NetworkModule module, Provider<Builder> restAdapterBuilderProvider, Provider<RequestInterceptor> headersProvider) {  
    return new NetworkModule_ProvideApiServiceFactory(module, restAdapterBuilderProvider, headersProvider);
  }
}

