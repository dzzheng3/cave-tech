package cavetech.com.challenge.takehome.data;

import android.app.Application;
import cavetech.com.challenge.takehome.lib.Glider;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DataModule_ProvideGlideFactory implements Factory<Glider> {
  private final DataModule module;
  private final Provider<Application> applicationProvider;

  public DataModule_ProvideGlideFactory(DataModule module, Provider<Application> applicationProvider) {  
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Glider get() {  
    Glider provided = module.provideGlide(applicationProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Glider> create(DataModule module, Provider<Application> applicationProvider) {  
    return new DataModule_ProvideGlideFactory(module, applicationProvider);
  }
}

