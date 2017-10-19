package cavetech.com.challenge.takehome.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;
import com.dji.challenge.R;

import cavetech.com.challenge.takehome.activities.AddPersonActivity;
import cavetech.com.challenge.takehome.activities.AddUserActivity;
import cavetech.com.challenge.takehome.lib.BaseFragment;

/**
 * Main fragment
 */
public class ControlFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_with_control, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Optional
    @OnClick(R.id.addUser)
    public void onUserButtonClick() {
        Intent intent = new Intent(getActivity(), AddUserActivity.class);
        startActivity(intent);
    }
    @Optional
    @OnClick(R.id.addPerson)
    public void onPersonButtonClick() {
        Intent intent = new Intent(getActivity(), AddPersonActivity.class);
        startActivity(intent);
    }
}
