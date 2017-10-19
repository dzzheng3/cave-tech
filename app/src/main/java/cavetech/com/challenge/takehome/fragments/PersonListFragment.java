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

import cavetech.com.challenge.takehome.adapters.PersonListAdapter;
import cavetech.com.challenge.takehome.aws.PersonDynamoDBManager;
import cavetech.com.challenge.takehome.lib.BaseFragment;

import java.util.ArrayList;

import javax.inject.Inject;

/**
 * User fragment
 */
public class PersonListFragment extends BaseFragment {
    private ArrayList<PersonDynamoDBManager.Person> items = new ArrayList<>();
    @Inject
    PersonListAdapter singleSelectAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_with_list, container, false);
        ButterKnife.inject(this, view);
        new GetUserListTask().execute();
        ListView listView = (ListView) view.findViewById(R.id.listOfUsers);
        singleSelectAdapter = new PersonListAdapter(items);
        listView.setAdapter(singleSelectAdapter);
        return view;
    }

    private class GetUserListTask extends AsyncTask<Void, Void, Void> {



        protected Void doInBackground(Void... inputs) {


            items = PersonDynamoDBManager.getPersonList();

            return null;
        }

        protected void onPostExecute(Void result) {
            singleSelectAdapter.add(items);

        }
    }


}
