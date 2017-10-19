package cavetech.com.challenge.takehome.lib;

import android.content.Context;
import com.bumptech.glide.DrawableTypeRequest;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

/**
 * Interface class to reduce the redundant call
 * on {@link com.bumptech.glide.Glide.with()}
 */
public class Glider {
    private final Context mContext;

    public Glider(Context mContext) {
        this.mContext = mContext;
    }

    public <T> DrawableTypeRequest load(T object) {
        final RequestManager requestManager = Glide.with(mContext);
        return requestManager.load(object);
    }

    public BitmapPool getBitmapPool() {
        return Glide.get(mContext).getBitmapPool();
    }
}

