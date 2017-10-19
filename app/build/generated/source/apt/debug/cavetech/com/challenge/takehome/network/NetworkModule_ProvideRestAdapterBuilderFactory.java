package cavetech.com.challenge.takehome.network;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter.Builder;
import retrofit.converter.Converter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class NetworkModule_ProvideRestAdapterBuilderFactory implements Factory<Builder> {
  private final NetworkModule module;
  private final Provider<RequestInterceptor> headersProvider;
  private final Provider<Converter> converterProvider;

  public NetworkModule_ProvideRestAdapterBuilderFactory(NetworkModule module, Provider<RequestInterceptor> headersProvider, Provider<Converter> converterProvider) {  
    assert module != null;
    this.module = module;
    assert headersProvider != null;
    this.headersProvider = headersProvider;
    assert converterProvider != null;
    this.converterProvider = converterProvider;
  }

  @Override
  public Builder get() {  
    Builder provided = module.provideRestAdapterBuilder(headersProvider.get(), converterProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Builder> create(NetworkModule module, Provider<RequestInterceptor> headersProvider, Provider<Converter> converterProvider) {  
    return new NetworkModule_ProvideRestAdapterBuilderFactory(module, headersProvider, converterProvider);
  }
}

