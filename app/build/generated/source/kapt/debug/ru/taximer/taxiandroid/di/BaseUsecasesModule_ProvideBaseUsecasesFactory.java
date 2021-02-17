package ru.taximer.taxiandroid.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ru.taximer.taxiandroid.network.TaxiApi;
import ru.taximer.taxiandroid.network.usecases.BaseUsecases;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseUsecasesModule_ProvideBaseUsecasesFactory implements Factory<BaseUsecases> {
  private final BaseUsecasesModule module;

  private final Provider<TaxiApi> endpointsProvider;

  public BaseUsecasesModule_ProvideBaseUsecasesFactory(
      BaseUsecasesModule module, Provider<TaxiApi> endpointsProvider) {
    this.module = module;
    this.endpointsProvider = endpointsProvider;
  }

  @Override
  public BaseUsecases get() {
    return Preconditions.checkNotNull(
        module.provideBaseUsecases(endpointsProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseUsecases> create(
      BaseUsecasesModule module, Provider<TaxiApi> endpointsProvider) {
    return new BaseUsecasesModule_ProvideBaseUsecasesFactory(module, endpointsProvider);
  }
}
