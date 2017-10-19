package cavetech.com.challenge.takehome.lib;

import android.support.v7.app.AppCompatActivity;
import com.squareup.otto.Bus;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final MembersInjector<AppCompatActivity> supertypeInjector;
  private final Provider<Bus> mBusProvider;
  private final Provider<Glider> mGliderProvider;

  public BaseActivity_MembersInjector(MembersInjector<AppCompatActivity> supertypeInjector, Provider<Bus> mBusProvider, Provider<Glider> mGliderProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert mBusProvider != null;
    this.mBusProvider = mBusProvider;
    assert mGliderProvider != null;
    this.mGliderProvider = mGliderProvider;
  }

  @Override
  public void injectMembers(BaseActivity instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.mBus = mBusProvider.get();
    instance.mGlider = mGliderProvider.get();
  }

  public static MembersInjector<BaseActivity> create(MembersInjector<AppCompatActivity> supertypeInjector, Provider<Bus> mBusProvider, Provider<Glider> mGliderProvider) {  
      return new BaseActivity_MembersInjector(supertypeInjector, mBusProvider, mGliderProvider);
  }
}

