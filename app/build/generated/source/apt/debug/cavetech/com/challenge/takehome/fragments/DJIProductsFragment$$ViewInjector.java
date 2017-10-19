// Generated code from Butter Knife. Do not modify!
package cavetech.com.challenge.takehome.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class DJIUsersFragment$$ViewInjector {
  public static void inject(Finder finder, final UsersListFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558519, "method 'getUser'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.getUser();
        }
      });
  }

  public static void reset(UsersListFragment target) {
  }
}
