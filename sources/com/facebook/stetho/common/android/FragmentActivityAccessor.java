package com.facebook.stetho.common.android;

import android.app.Activity;

public interface FragmentActivityAccessor<FRAGMENT_ACTIVITY extends Activity, FRAGMENT_MANAGER> {
    FRAGMENT_MANAGER getFragmentManager(FRAGMENT_ACTIVITY fragment_activity);
}
