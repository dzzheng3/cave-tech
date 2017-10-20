// Generated code from Butter Knife. Do not modify!
package cavetech.com.challenge.takehome.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class PersonListFragment$$ViewInjector {
  public static void inject(Finder finder, final cavetech.com.challenge.takehome.fragments.PersonListFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558521, "field 'listOfUsers'");
    target.listOfUsers = (android.widget.ListView) view;
    view = finder.findRequiredView(source, 2131558522, "field 'progressbarLoadingAlbums'");
    target.progressbarLoadingAlbums = (android.widget.ProgressBar) view;
  }

  public static void reset(cavetech.com.challenge.takehome.fragments.PersonListFragment target) {
    target.listOfUsers = null;
    target.progressbarLoadingAlbums = null;
  }
}
