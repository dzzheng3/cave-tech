package cavetech.com.challenge.takehome.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dji.challenge.R;

import java.util.List;

import cavetech.com.challenge.takehome.aws.PersonDynamoDBManager;

public class PersonListAdapter extends AbsBaseAdapter<PersonDynamoDBManager.Person>{
    private List<PersonDynamoDBManager.Person> listOfUsers;
    public PersonListAdapter(List<PersonDynamoDBManager.Person> listOfUsers) {
        super(listOfUsers);
        this.listOfUsers = listOfUsers;
    }

    @Override
    protected View newView(LayoutInflater inflater, ViewGroup parent, int position) {
        return LayoutInflater.from(parent.getContext())
                             .inflate(R.layout.single_row, parent, false);
    }

    @Override
    protected void bindView(View view, int position) {
        PersonDynamoDBManager.Person User = listOfUsers.get(position);
        TextView textView = (TextView) view.findViewById(R.id.User_name);
        textView.setText(User.getUsername());
        textView = (TextView) view.findViewById(R.id.User_description);
        textView.setText(User.getDescription());
    }
}