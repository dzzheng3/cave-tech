package cavetech.com.challenge.takehome.lib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.squareup.otto.Bus;
import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {
    @Inject protected Bus mBus;
    @Inject protected Glider mGlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLib.getAppComponent().inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBus.register(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mBus.unregister(this);
    }
}
