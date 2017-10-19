// Generated code from Butter Knife. Do not modify!
package cavetech.com.challenge.takehome.fragments;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AirCraftControlFragment$$ViewInjector {
  public static void inject(Finder finder, final ControlFragment target, Object source) {
    View view;
    view = finder.findOptionalView(source, 2131558516);
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
    view = finder.findOptionalView(source, 2131558517);
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

  public static void reset(ControlFragment target) {
  }
}
