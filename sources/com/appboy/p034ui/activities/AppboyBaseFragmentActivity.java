package com.appboy.p034ui.activities;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.C0532d;
import com.appboy.C1440a;
import com.appboy.p034ui.inappmessage.AppboyInAppMessageManager;

/* renamed from: com.appboy.ui.activities.AppboyBaseFragmentActivity */
public class AppboyBaseFragmentActivity extends C0532d {
    public void onPause() {
        super.onPause();
        AppboyInAppMessageManager.getInstance().unregisterInAppMessageManager(this);
    }

    public void onResume() {
        super.onResume();
        AppboyInAppMessageManager.getInstance().registerInAppMessageManager(this);
    }

    public void onStart() {
        super.onStart();
        C1440a.m6921c((Context) this).mo6572b((Activity) this);
    }

    public void onStop() {
        super.onStop();
        C1440a.m6921c((Context) this).mo6558a((Activity) this);
    }
}
