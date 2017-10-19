package cavetech.com.challenge.takehome.fragments;

import cavetech.com.challenge.takehome.adapters.PersonListAdapter;
import cavetech.com.challenge.takehome.lib.BaseFragment;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated("dagger.internal.codegen.ComponentProcessor")
public final class PersonListFragment_MembersInjector implements MembersInjector<PersonListFragment> {
  private final MembersInjector<BaseFragment> supertypeInjector;
  private final Provider<PersonListAdapter> singleSelectAdapterProvider;

  public PersonListFragment_MembersInjector(MembersInjector<BaseFragment> supertypeInjector, Provider<PersonListAdapter> singleSelectAdapterProvider) {  
    assert supertypeInjector != null;
    this.supertypeInjector = supertypeInjector;
    assert singleSelectAdapterProvider != null;
    this.singleSelectAdapterProvider = singleSelectAdapterProvider;
  }

  @Override
  public void injectMembers(PersonListFragment instance) {  
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    supertypeInjector.injectMembers(instance);
    instance.singleSelectAdapter = singleSelectAdapterProvider.get();
  }

  public static MembersInjector<PersonListFragment> create(MembersInjector<BaseFragment> supertypeInjector, Provider<PersonListAdapter> singleSelectAdapterProvider) {  
      return new PersonListFragment_MembersInjector(supertypeInjector, singleSelectAdapterProvider);
  }
}

