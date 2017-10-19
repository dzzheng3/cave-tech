package cavetech.com.challenge.takehome.data;

import com.squareup.otto.Bus;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DataModule_ProvideBusFactory implements Factory<Bus> {
  private final DataModule module;

  public DataModule_ProvideBusFactory(DataModule module) {  
    assert module != null;
    this.module = module;
  }

  @Override
  public Bus get() {  
    Bus provided = module.provideBus();
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Bus> create(DataModule module) {  
    return new DataModule_ProvideBusFactory(module);
  }
}

