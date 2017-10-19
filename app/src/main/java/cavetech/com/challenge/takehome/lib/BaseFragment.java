package cavetech.com.challenge.takehome.lib;

import android.app.Fragment;
import android.os.Bundle;
import com.squareup.otto.Bus;
import javax.inject.Inject;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public abstract class BaseFragment extends Fragment {

    @Inject protected Bus mBus;
    @Inject protected Glider mGlider;
    private CompositeSubscription mSubscriptions = new CompositeSubscription();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyLib.getAppComponent().inject(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        mBus.register(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        mBus.unregister(this);
    }

    @Override
    public void onDestroy() {
        if (!mSubscriptions.isUnsubscribed()) {
            mSubscriptions.unsubscribe();
        }
        super.onDestroy();
    }

    protected void addSubscription(Subscription subscription) {
        mSubscriptions.add(subscription);
    }
}
