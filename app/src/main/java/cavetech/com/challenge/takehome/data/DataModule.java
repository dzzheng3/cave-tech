package cavetech.com.challenge.takehome.data;

import android.app.Application;
import cavetech.com.challenge.takehome.lib.Glider;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.otto.Bus;
import dagger.Module;
import dagger.Provides;
import java.util.Date;
import javax.inject.Singleton;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

@Module
public class DataModule {

    @Provides
    @Singleton
    Bus provideBus() {
        return new MainBus();
    }

    @Provides
    @Singleton
    Gson provideGson() {
        return new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                                .registerTypeAdapter(Date.class, new DateDeserializer())
                                .setDateFormat(DateDeserializer.DATE_FORMATS[0])
                                .create();
    }

    @Provides
    @Singleton
    Converter provideConverter(Gson gson) {
        return new GsonConverter(gson);
    }

    @Provides
    @Singleton
    Glider provideGlide(Application application) {
        return new Glider(application);
    }
}
