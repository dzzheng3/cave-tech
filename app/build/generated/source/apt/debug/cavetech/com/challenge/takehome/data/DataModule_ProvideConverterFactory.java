package cavetech.com.challenge.takehome.data;

import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit.converter.Converter;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DataModule_ProvideConverterFactory implements Factory<Converter> {
  private final DataModule module;
  private final Provider<Gson> gsonProvider;

  public DataModule_ProvideConverterFactory(DataModule module, Provider<Gson> gsonProvider) {  
    assert module != null;
    this.module = module;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Converter get() {  
    Converter provided = module.provideConverter(gsonProvider.get());
    if (provided == null) {
      throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
    return provided;
  }

  public static Factory<Converter> create(DataModule module, Provider<Gson> gsonProvider) {  
    return new DataModule_ProvideConverterFactory(module, gsonProvider);
  }
}

