package cavetech.com.challenge.takehome.lib;

import android.app.Fragment;
import com.squareup.otto.Bus;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class BaseFragment_MembersInjector implements MembersInjector<BaseFragment> {
  private final MembersInjector<Fragment> supertypeInjector;
  private final Provider<Bus> mBusProvider;
  private final Provider<Glider> mGliderProvider;

  public BaseFragment_MembersInjector(MembersInjector<Fragment> supertypeInjector, Provider<Bus> mBusProvider, Provider<Glider> mGliderProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert mBusProvider != null;
    this.mBusProvider = mBusProvider;
    assert mGliderProvider != null;
    this.mGliderProvider = mGliderProvider;
  }

  @Override
  public void injectMembers(BaseFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.mBus = mBusProvider.get();
    instance.mGlider = mGliderProvider.get();
  }

  public static MembersInjector<BaseFragment> create(MembersInjector<Fragment> supertypeInjector, Provider<Bus> mBusProvider, Provider<Glider> mGliderProvider) {  
      return new BaseFragment_MembersInjector(supertypeInjector, mBusProvider, mGliderProvider);
  }
}

