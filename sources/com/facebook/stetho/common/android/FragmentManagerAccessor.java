package com.facebook.stetho.common.android;

import java.util.List;

public interface FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> {
    List<FRAGMENT> getAddedFragments(FRAGMENT_MANAGER fragment_manager);
}
