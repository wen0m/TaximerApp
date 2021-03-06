package ru.taximer.taxiandroid.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class NetModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetModule module;

  public NetModule_ProvideOkHttpClientFactory(NetModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(NetModule module) {
    return new NetModule_ProvideOkHttpClientFactory(module);
  }
}
