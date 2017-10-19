package cavetech.com.challenge.takehome.activities;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.dji.challenge.R;

import cavetech.com.challenge.takehome.aws.AmazonClientManager;
import cavetech.com.challenge.takehome.fragments.ControlFragment;
import cavetech.com.challenge.takehome.fragments.PersonListFragment;
import cavetech.com.challenge.takehome.fragments.UsersListFragment;
import cavetech.com.challenge.takehome.lib.BaseActivity;
import cavetech.com.challenge.takehome.lib.BaseFragment;

/**
 * Main activity
 */
public class MainActivity extends BaseActivity {

    private static final int FRAGMENT_HOME = 0;
    private static final int FRAGMENT_PERSON = 1;
    private static final int FRAGMENT_USER = 2;
    private int mPos = 0;
    public static AmazonClientManager clientManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        clientManager = new AmazonClientManager(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    // update the main content by replacing fragments
    private void selectFragment(int position) {

        // Re-selecting the same fragment does nothing, except for messaging
        if (mPos == position) {
            return;
        }

        // Select fragment based on position
        BaseFragment fragment;
        switch (position) {
            case FRAGMENT_HOME:
                fragment = new ControlFragment();
                break;
            case FRAGMENT_PERSON:
                fragment = new PersonListFragment();
                break;
            case FRAGMENT_USER:
                fragment = new UsersListFragment();
                break;
            default:
                // Do nothing for invalid position
                return;
        }

        // Create a transaction and add the fragment to the stack
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.fragment, fragment);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        ft.commit();

        // Store current position
        mPos = position;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_person) {
            selectFragment(FRAGMENT_PERSON);
            return true;
        }
        if (id == R.id.action_users) {
            selectFragment(FRAGMENT_USER);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
