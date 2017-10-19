// Generated code from Butter Knife. Do not modify!
package cavetech.com.challenge.takehome.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class AddUserActivity$$ViewInjector {
  public static void inject(Finder finder, final cavetech.com.challenge.takehome.activities.AddUserActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558510, "field 'etUsername'");
    target.etUsername = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131558511, "field 'etDesc'");
    target.etDesc = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131558512, "field 'fabAdd' and method 'onAddClicked'");
    target.fabAdd = (android.support.design.widget.FloatingActionButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAddClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558508, "field 'btnCreateTable' and method 'onCreateClicked'");
    target.btnCreateTable = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCreateClicked();
        }
      });
    view = finder.findRequiredView(source, 2131558509, "field 'etNum'");
    target.etNum = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131558513, "field 'fabDelete' and method 'onDeleteClicked'");
    target.fabDelete = (android.support.design.widget.FloatingActionButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDeleteClicked();
        }
      });
  }

  public static void reset(cavetech.com.challenge.takehome.activities.AddUserActivity target) {
    target.etUsername = null;
    target.etDesc = null;
    target.fabAdd = null;
    target.btnCreateTable = null;
    target.etNum = null;
    target.fabDelete = null;
  }
}
