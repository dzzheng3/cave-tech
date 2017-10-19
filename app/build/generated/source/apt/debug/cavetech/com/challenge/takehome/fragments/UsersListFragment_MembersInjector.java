package cavetech.com.challenge.takehome.fragments;

import cavetech.com.challenge.takehome.adapters.UserListAdapter;
import cavetech.com.challenge.takehome.lib.BaseFragment;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class UsersListFragment_MembersInjector implements MembersInjector<UsersListFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<UserListAdapter> singleSelectAdapterProvider;

  public UsersListFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<UserListAdapter> singleSelectAdapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert singleSelectAdapterProvider != null;
    this.singleSelectAdapterProvider = singleSelectAdapterProvider;
  }

  @Override
  public void injectMembers(UsersListFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.singleSelectAdapter = singleSelectAdapterProvider.get();
  }

  public static MembersInjector<UsersListFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<UserListAdapter> singleSelectAdapterProvider) {  
      return new UsersListFragment_MembersInjector(supertypeInjector, singleSelectAdapterProvider);
  }
}

