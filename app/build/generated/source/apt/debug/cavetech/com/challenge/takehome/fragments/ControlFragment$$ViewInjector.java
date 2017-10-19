// Generated code from Butter Knife. Do not modify!
package cavetech.com.challenge.takehome.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ControlFragment$$ViewInjector {
  public static void inject(Finder finder, final cavetech.com.challenge.takehome.fragments.ControlFragment target, Object source) {
    View view;
    view = finder.findOptionalView(source, 2131558518);
    if (view != null) {
      view.setOnClickListener(
        new android.view.View.OnClickListener() {
          @Override public void onClick(
            android.view.View p0
          ) {
            target.onUserButtonClick();
          }
        });
    }
    view = finder.findOptionalView(source, 2131558519);
    if (view != null) {
      view.setOnClickListener(
        new android.view.View.OnClickListener() {
          @Override public void onClick(
            android.view.View p0
          ) {
            target.onPersonButtonClick();
          }
        });
    }
  }

  public static void reset(cavetech.com.challenge.takehome.fragments.ControlFragment target) {
  }
}
