package ru.taximer.taxiandroid.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import retrofit2.Converter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvideConverterFactoryFactory implements Factory<Converter.Factory> {
  private final NetModule module;

  public NetModule_ProvideConverterFactoryFactory(NetModule module) {
    this.module = module;
  }

  @Override
  public Converter.Factory get() {
    return Preconditions.checkNotNull(
        module.provideConverterFactory(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Converter.Factory> create(NetModule module) {
    return new NetModule_ProvideConverterFactoryFactory(module);
  }
}
