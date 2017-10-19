package cavetech.com.challenge.takehome.data;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = {
    DataModule.class
})
public interface DataComponent {
}
