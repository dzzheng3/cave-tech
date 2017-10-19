package cavetech.com.challenge.takehome.fragments;

import com.google.gson.Gson;
import dagger.MembersInjector;
import cavetech.com.challenge.takehome.lib.BaseFragment;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class DJIUsersFragment_MembersInjector implements MembersInjector<UsersListFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<Gson> gsonProvider;

  public DJIUsersFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<Gson> gsonProvider) {
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public void injectMembers(UsersListFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.gson = gsonProvider.get();
  }

  public static MembersInjector<UsersListFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<Gson> gsonProvider) {
      return new DJIUsersFragment_MembersInjector(supertypeInjector, gsonProvider);
  }
}

