package cavetech.com.challenge.takehome.lib;

import dagger.Component;
import cavetech.com.challenge.takehome.network.ApiClient;
import javax.inject.Singleton;

@Singleton
@Component(
    modules = {
        AppModule.class
    })
public interface AppComponent {
    void inject(BaseActivity baseActivity);

    void inject(BaseFragment baseFragment);

    void inject(Session session);

    void inject(ApiClient apiClient);
}
