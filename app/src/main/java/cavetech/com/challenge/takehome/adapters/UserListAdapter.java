package cavetech.com.challenge.takehome.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.dji.challenge.R;

import cavetech.com.challenge.takehome.aws.UserDynamoDBManager;

import java.util.List;

public class UserListAdapter extends AbsBaseAdapter<UserDynamoDBManager.User>{
    private List<UserDynamoDBManager.User> listOfUsers;
    public UserListAdapter(List<UserDynamoDBManager.User> listOfUsers) {
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
        UserDynamoDBManager.User User = listOfUsers.get(position);
        TextView textView = (TextView) view.findViewById(R.id.User_name);
        textView.setText(User.getUsername());
        textView = (TextView) view.findViewById(R.id.User_description);
        textView.setText(User.getDescription());
    }
}