package ru.taximer.taxiandroid.di;

import android.content.Context;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import ru.taximer.taxiandroid.network.TaxiApi;
import ru.taximer.taxiandroid.network.usecases.BaseUsecases;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerTaxiAppComponent implements TaxiAppComponent {
  private AppModule appModule;

  private Provider<OkHttpClient> provideOkHttpClientProvider;

  private Provider<Converter.Factory> provideConverterFactoryProvider;

  private Provider<CallAdapter.Factory> provideCallAdapterFactoryProvider;

  private Provider<String> changeURlProvider;

  private Provider<TaxiApi> provideBaseEndpointsProvider;

  private Provider<BaseUsecases> provideBaseUsecasesProvider;

  private DaggerTaxiAppComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.appModule = builder.appModule;
    this.provideOkHttpClientProvider =
        NetModule_ProvideOkHttpClientFactory.create(builder.netModule);
    this.provideConverterFactoryProvider =
        NetModule_ProvideConverterFactoryFactory.create(builder.netModule);
    this.provideCallAdapterFactoryProvider =
        NetModule_ProvideCallAdapterFactoryFactory.create(builder.netModule);
    this.changeURlProvider = AppModule_ChangeURlFactory.create(builder.appModule);
    this.provideBaseEndpointsProvider =
        DoubleCheck.provider(
            BaseEndpointsModule_ProvideBaseEndpointsFactory.create(
                builder.baseEndpointsModule,
                provideOkHttpClientProvider,
                provideConverterFactoryProvider,
                provideCallAdapterFactoryProvider,
                changeURlProvider));
    this.provideBaseUsecasesProvider =
        DoubleCheck.provider(
            BaseUsecasesModule_ProvideBaseUsecasesFactory.create(
                builder.baseUsecasesModule, provideBaseEndpointsProvider));
  }

  @Override
  public Context appContext() {
    return Preconditions.checkNotNull(
        appModule.provideAppContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  @Override
  public TaxiApi baseEndpoints() {
    return provideBaseEndpointsProvider.get();
  }

  @Override
  public BaseUsecases baseUsecases() {
    return provideBaseUsecasesProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private NetModule netModule;

    private BaseEndpointsModule baseEndpointsModule;

    private BaseUsecasesModule baseUsecasesModule;

    private Builder() {}

    public TaxiAppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      if (netModule == null) {
        this.netModule = new NetModule();
      }
      if (baseEndpointsModule == null) {
        this.baseEndpointsModule = new BaseEndpointsModule();
      }
      if (baseUsecasesModule == null) {
        this.baseUsecasesModule = new BaseUsecasesModule();
      }
      return new DaggerTaxiAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder netModule(NetModule netModule) {
      this.netModule = Preconditions.checkNotNull(netModule);
      return this;
    }

    public Builder baseEndpointsModule(BaseEndpointsModule baseEndpointsModule) {
      this.baseEndpointsModule = Preconditions.checkNotNull(baseEndpointsModule);
      return this;
    }

    public Builder baseUsecasesModule(BaseUsecasesModule baseUsecasesModule) {
      this.baseUsecasesModule = Preconditions.checkNotNull(baseUsecasesModule);
      return this;
    }
  }
}
