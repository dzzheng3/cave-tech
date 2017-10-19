package cavetech.com.challenge.takehome.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import butterknife.ButterKnife;

import com.dji.challenge.R;

import cavetech.com.challenge.takehome.adapters.UserListAdapter;
import cavetech.com.challenge.takehome.aws.UserDynamoDBManager;
import cavetech.com.challenge.takehome.lib.BaseFragment;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * User fragment
 */
public class UsersListFragment extends BaseFragment {
    private ArrayList<UserDynamoDBManager.User> items = new ArrayList<>();
    @Inject
    UserListAdapter singleSelectAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_with_list, container, false);
        ButterKnife.inject(this, view);
        new GetUserListTask().execute();
        ListView listView = (ListView) view.findViewById(R.id.listOfUsers);
        singleSelectAdapter = new UserListAdapter(items);
        listView.setAdapter(singleSelectAdapter);
        return view;
    }

    private class GetUserListTask extends AsyncTask<Void, Void, Void> {



        protected Void doInBackground(Void... inputs) {


            items = UserDynamoDBManager.getUserList();

            return null;
        }

        protected void onPostExecute(Void result) {
            singleSelectAdapter.add(items);

        }
    }


}
