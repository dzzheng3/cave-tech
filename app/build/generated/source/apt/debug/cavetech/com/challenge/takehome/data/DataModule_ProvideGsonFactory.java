package cavetech.com.challenge.takehome.data;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DataModule_ProvideGsonFactory implements Factory<Gson> {
  private final DataModule module;

  public DataModule_ProvideGsonFactory(DataModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {  
    Gson provided = module.provideGson();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Gson> create(DataModule module) {  
    return new DataModule_ProvideGsonFactory(module);
  }
}

