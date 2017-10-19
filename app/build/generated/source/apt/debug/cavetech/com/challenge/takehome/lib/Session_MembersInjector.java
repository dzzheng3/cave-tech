package cavetech.com.challenge.takehome.lib;

import com.google.gson.Gson;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class Session_MembersInjector implements MembersInjector<Session> {
  private final Provider<Gson> sGsonProvider;

  public Session_MembersInjector(Provider<Gson> sGsonProvider) {  
    assert sGsonProvider != null;
    this.sGsonProvider = sGsonProvider;
  }

  @Override
  public void injectMembers(Session instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.sGson = sGsonProvider.get();
  }

  public static MembersInjector<Session> create(Provider<Gson> sGsonProvider) {  
      return new Session_MembersInjector(sGsonProvider);
  }
}

