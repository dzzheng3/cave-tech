package cavetech.com.challenge.takehome.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cavetech.com.challenge.takehome.lib.Glider;
import com.squareup.otto.Bus;
import java.util.List;
import javax.inject.Inject;

/**
 * BaseAdapter
 *
 * @param T the type of object
 */
public abstract class AbsBaseAdapter<T> extends BaseAdapter {

    // Member Variables //////////////////////////////////////////////////////////////////
    @Inject protected Glider mGlider;
    @Inject protected Bus mBus;
    private List<T> mBackingList;

    // Constructors //////////////////////////////////////////////////////////////////////
    public AbsBaseAdapter(List<T> backingList) {
        mBackingList = backingList;
    }

    // Public Methods ////////////////////////////////////////////////////////////////////
    /**
     * Adds the collection to the backing adapter. Note, this method automatically
     * triggers a {@link #notifyDataSetChanged()} call.
     */
    public void add(List<T> list) {

        if (mBackingList == null) {
            mBackingList = list;
        } else {
            mBackingList.addAll(list);
        }
        notifyDataSetChanged();
    }

    /**
     * Clears the data from the backing adapter. Note, this method automatically triggers
     * a {@link #notifyDataSetChanged()} call.
     */
    public void clear() {

        if (mBackingList != null) {
            mBackingList.clear();
            notifyDataSetChanged();
        }
    }

    // Protected Methods /////////////////////////////////////////////////////////////////

    protected abstract View newView(LayoutInflater inflater, ViewGroup parent, int position);

    protected abstract void bindView(View view, int position);

    // BaseAdapter Methods ///////////////////////////////////////////////////////////////

    @Override
    public int getCount() {
        return (mBackingList == null ? 0 : mBackingList.size());
    }

    @Override
    public T getItem(int position) {
        if (mBackingList == null || position < 0 || position >= getCount()) {
            return null;
        } else {
            return mBackingList.get(position);
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View v =
            (convertView != null) ? convertView : newView(LayoutInflater.from(parent.getContext()), parent, position);
        bindView(v, position);

        return v;
    }
}

