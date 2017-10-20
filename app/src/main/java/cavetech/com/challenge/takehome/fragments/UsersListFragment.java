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
import cavetech.com.challenge.takehome.adapters.UserListAdapter;
import cavetech.com.challenge.takehome.aws.UserDynamoDBManager;
import cavetech.com.challenge.takehome.lib.BaseFragment;

/**
 * User fragment
 */
public class UsersListFragment extends BaseFragment {
    @InjectView(R.id.listOfUsers)
    ListView listOfUsers;
    @InjectView(R.id.progressbar_loading_albums)
    ProgressBar progressbarLoadingAlbums;
    private ArrayList<UserDynamoDBManager.User> items = new ArrayList<>();
    @Inject
    UserListAdapter singleSelectAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_with_list, container, false);
        ButterKnife.inject(this, view);
        new GetUserListTask().execute();
        singleSelectAdapter = new UserListAdapter(items);
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


            items = UserDynamoDBManager.getUserList();

            return null;
        }

        protected void onPostExecute(Void result) {
            singleSelectAdapter.add(items);
            progressbarLoadingAlbums.setVisibility(View.GONE);
        }
    }


}
