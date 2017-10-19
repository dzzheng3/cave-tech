package cavetech.com.challenge.takehome.network;

import com.google.gson.Gson;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class ApiClient_MembersInjector implements MembersInjector<ApiClient> {
  private final Provider<ApiService> sServiceProvider;
  private final Provider<Gson> sGsonProvider;

  public ApiClient_MembersInjector(Provider<ApiService> sServiceProvider, Provider<Gson> sGsonProvider) {  
    assert sServiceProvider != null;
    this.sServiceProvider = sServiceProvider;
    assert sGsonProvider != null;
    this.sGsonProvider = sGsonProvider;
  }

  @Override
  public void injectMembers(ApiClient instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.sService = sServiceProvider.get();
    instance.sGson = sGsonProvider.get();
  }

  public static MembersInjector<ApiClient> create(Provider<ApiService> sServiceProvider, Provider<Gson> sGsonProvider) {  
      return new ApiClient_MembersInjector(sServiceProvider, sGsonProvider);
  }
}

