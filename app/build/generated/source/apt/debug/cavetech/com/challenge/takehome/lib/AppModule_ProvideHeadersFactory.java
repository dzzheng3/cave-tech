package cavetech.com.challenge.takehome.lib;

import dagger.internal.Factory;
import javax.annotation.Generated;
import retrofit.RequestInterceptor;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AppModule_ProvideHeadersFactory implements Factory<RequestInterceptor> {
  private final AppModule module;

  public AppModule_ProvideHeadersFactory(AppModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public RequestInterceptor get() {  
    RequestInterceptor provided = module.provideHeaders();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<RequestInterceptor> create(AppModule module) {  
    return new AppModule_ProvideHeadersFactory(module);
  }
}

