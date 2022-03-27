// Generated by Dagger (https://dagger.dev).
package com.aman.ecommerce.di;

import android.app.Application;
import com.aman.ecommerce.data.repo.ProductRepo;
import com.aman.ecommerce.data.repo.ProductRepo_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<Retrofit> retrofitProvider;

  private DaggerAppComponent(NetworkModule networkModuleParam, Application application) {

    initialize(networkModuleParam, application);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final NetworkModule networkModuleParam, final Application application) {
    this.retrofitProvider = DoubleCheck.provider(NetworkModule_RetrofitProviderFactory.create(networkModuleParam));
  }

  @Override
  public void inject(ProductRepo productRepo) {
    injectProductRepo(productRepo);}

  private ProductRepo injectProductRepo(ProductRepo instance) {
    ProductRepo_MembersInjector.injectRetrofit(instance, retrofitProvider.get());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(new NetworkModule(), application);
    }
  }
}
