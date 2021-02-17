package ru.taximer.taxiandroid.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import ru.taximer.taxiandroid.network.TaxiApi;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseEndpointsModule_ProvideBaseEndpointsFactory implements Factory<TaxiApi> {
  private final BaseEndpointsModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<Converter.Factory> converterFactoryProvider;

  private final Provider<CallAdapter.Factory> callAdapterFactoryProvider;

  private final Provider<String> changeURlProvider;

  public BaseEndpointsModule_ProvideBaseEndpointsFactory(
      BaseEndpointsModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Converter.Factory> converterFactoryProvider,
      Provider<CallAdapter.Factory> callAdapterFactoryProvider,
      Provider<String> changeURlProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
    this.converterFactoryProvider = converterFactoryProvider;
    this.callAdapterFactoryProvider = callAdapterFactoryProvider;
    this.changeURlProvider = changeURlProvider;
  }

  @Override
  public TaxiApi get() {
    return Preconditions.checkNotNull(
        module.provideBaseEndpoints(
            okHttpClientProvider.get(),
            converterFactoryProvider.get(),
            callAdapterFactoryProvider.get(),
            changeURlProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TaxiApi> create(
      BaseEndpointsModule module,
      Provider<OkHttpClient> okHttpClientProvider,
      Provider<Converter.Factory> converterFactoryProvider,
      Provider<CallAdapter.Factory> callAdapterFactoryProvider,
      Provider<String> changeURlProvider) {
    return new BaseEndpointsModule_ProvideBaseEndpointsFactory(
        module,
        okHttpClientProvider,
        converterFactoryProvider,
        callAdapterFactoryProvider,
        changeURlProvider);
  }
}
