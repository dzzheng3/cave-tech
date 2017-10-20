package cavetech.com.challenge.takehome.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.dji.challenge.R;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;
import cavetech.com.challenge.takehome.adapters.PersonListAdapter;
import cavetech.com.challenge.takehome.aws.PersonDynamoDBManager;
import cavetech.com.challenge.takehome.lib.BaseFragment;

/**
 * User fragment
 */
public class PersonListFragment extends BaseFragment {
    @InjectView(R.id.listOfUsers)
    ListView listOfUsers;
    @InjectView(R.id.progressbar_loading_albums)
    ProgressBar progressbarLoadingAlbums;
    private ArrayList<PersonDynamoDBManager.Person> items = new ArrayList<>();
    @Inject
    PersonListAdapter singleSelectAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_with_list, container, false);
        ButterKnife.inject(this, view);
        new GetUserListTask().execute();
        singleSelectAdapter = new PersonListAdapter(items);
        listOfUsers.setAdapter(singleSelectAdapter);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    private class GetUserListTask extends AsyncTask<Void, Void, Void> {


        protected Void doInBackground(Void... inputs) {


            items = PersonDynamoDBManager.getPersonList();

            return null;
        }

        protected void onPostExecute(Void result) {
            singleSelectAdapter.add(items);

            progressbarLoadingAlbums.setVisibility(View.GONE);
        }
    }


}
