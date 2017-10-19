package cavetech.com.challenge.takehome.adapters;

import android.widget.BaseAdapter;
import cavetech.com.challenge.takehome.lib.Glider;
import com.squareup.otto.Bus;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class AbsBaseAdapter_MembersInjector<T> implements MembersInjector<AbsBaseAdapter<T>> {
  private final MembersInjector<BaseAdapter> supertypeInjector;
  private final Provider<Glider> mGliderProvider;
  private final Provider<Bus> mBusProvider;

  public AbsBaseAdapter_MembersInjector(MembersInjector<BaseAdapter> supertypeInjector, Provider<Glider> mGliderProvider, Provider<Bus> mBusProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert mGliderProvider != null;
    this.mGliderProvider = mGliderProvider;
    assert mBusProvider != null;
    this.mBusProvider = mBusProvider;
  }

  @Override
  public void injectMembers(AbsBaseAdapter<T> instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.mGlider = mGliderProvider.get();
    instance.mBus = mBusProvider.get();
  }

  public static <T> MembersInjector<AbsBaseAdapter<T>> create(MembersInjector<BaseAdapter> supertypeInjector, Provider<Glider> mGliderProvider, Provider<Bus> mBusProvider) {  
      return new AbsBaseAdapter_MembersInjector<T>(supertypeInjector, mGliderProvider, mBusProvider);
  }
}

