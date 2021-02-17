package ru.taximer.taxiandroid.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ChangeURlFactory implements Factory<String> {
  private final AppModule module;

  public AppModule_ChangeURlFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.changeURl(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(AppModule module) {
    return new AppModule_ChangeURlFactory(module);
  }
}
